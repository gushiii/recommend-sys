package com.gushiii.recommend.controller;

import com.gushiii.recommend.common.BusinessException;
import com.gushiii.recommend.common.CommonRes;
import com.gushiii.recommend.common.EmBusinessError;
import com.gushiii.recommend.model.CategoryModel;
import com.gushiii.recommend.model.ShopModel;
import com.gushiii.recommend.service.CategoryService;
import com.gushiii.recommend.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : GUSHIII
 * @version : 1.0
 * @projectName : recommend-sys
 * @package : com.gushiii.recommend.controller
 * @className : ShopController
 * @description : TODO
 * @date : 2023/10/15 00:51
 */
@Controller("/shop")
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/recommend")
    @ResponseBody
    public CommonRes recommend(@RequestParam(name = "longitude") BigDecimal longitude, @RequestParam(name = "latitude") BigDecimal latitude) throws BusinessException {
        if (longitude == null || latitude == null) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }

        List<ShopModel> shopModels = shopService.recommend(longitude, latitude);
        return CommonRes.create(shopModels);
    }

    @RequestMapping("/search")
    @ResponseBody
    public CommonRes search(@RequestParam(name = "longitude") BigDecimal longitude,
                            @RequestParam(name = "latitude") BigDecimal latitude,
                            @RequestParam(name = "keyword") String keyword,
                            @RequestParam(name = "tags", required = false) String tags,
                            @RequestParam(name = "categoryId", required = false) Integer categoryId,
                            @RequestParam(name = "orderby", required = false) Integer orderby) throws BusinessException {

        if (StringUtils.isEmpty(keyword) || longitude == null || latitude == null) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }

        List<ShopModel> shopModels = shopService.search(longitude, latitude, keyword,  orderby, categoryId, tags);
        List<CategoryModel> categoryModels = categoryService.selectAll();
        List<Map<String, Object>> tagsAggregation = shopService.searchGroupByTags(keyword, categoryId, tags);
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("category", categoryModels);
        resMap.put("shop", shopModels);
        resMap.put("tags", tagsAggregation);
        return CommonRes.create(resMap);
    }

}
