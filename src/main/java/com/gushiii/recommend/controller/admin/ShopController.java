package com.gushiii.recommend.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gushiii.recommend.common.AdminPermission;
import com.gushiii.recommend.common.BusinessException;
import com.gushiii.recommend.common.CommonUtil;
import com.gushiii.recommend.common.EmBusinessError;
import com.gushiii.recommend.model.CategoryModel;
import com.gushiii.recommend.model.ShopModel;
import com.gushiii.recommend.request.CategoryCreateReq;
import com.gushiii.recommend.request.PageQuery;
import com.gushiii.recommend.request.ShopCreateReq;
import com.gushiii.recommend.service.CategoryService;
import com.gushiii.recommend.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * @author : GUSHIII
 * @version : 1.0
 * @projectName : recommend-sys
 * @package : com.gushiii.recommend.controller.admin
 * @className : ShopController
 * @description : TODO
 * @date : 2023/10/14 22:19
 */
@Controller("/admin/shop")
@RequestMapping("/admin/shop")
public class ShopController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ShopService shopService;

    @RequestMapping("/index")
    @AdminPermission
    public ModelAndView index(PageQuery pageQuery) {

        PageHelper.startPage(pageQuery.getPage(), pageQuery.getSize());

        List<ShopModel> shopModels = shopService.selectAll();
        PageInfo<ShopModel> shopModelPageInfo = new PageInfo<>(shopModels);

        ModelAndView modelAndView = new ModelAndView("/admin/shop/index");
        modelAndView.addObject("data", shopModelPageInfo);
        modelAndView.addObject("CONTROLLER_NAME", "shop");
        modelAndView.addObject("ACTION_NAME", "index");
        return modelAndView;
    }

    @RequestMapping("/createpage")
    @AdminPermission
    public ModelAndView createpage() {
        ModelAndView modelAndView = new ModelAndView("/admin/shop/create");
        modelAndView.addObject("CONTROLLER_NAME", "shop");
        modelAndView.addObject("ACTION_NAME", "create");
        return modelAndView;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @AdminPermission
    public String create(@Valid ShopCreateReq shopCreateReq, BindingResult bindingResult) throws BusinessException {
        if (bindingResult.hasErrors()) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, CommonUtil.processErrorString(bindingResult));
        }
        ShopModel shopModel = new ShopModel();
        shopModel.setName(shopCreateReq.getName());
        shopModel.setIconUrl(shopCreateReq.getIconUrl());
        shopModel.setAddress(shopCreateReq.getAddress());
        shopModel.setCategoryId(shopCreateReq.getCategoryId());
        shopModel.setSellerId(shopCreateReq.getSellerId());
        shopModel.setStartTime(shopCreateReq.getStartTime());
        shopModel.setEndTime(shopCreateReq.getEndTime());
        shopModel.setLatitude(shopCreateReq.getLatitude());
        shopModel.setLongitude(shopCreateReq.getLongitude());
        shopModel.setPricePerMan(shopCreateReq.getPricePerMan());

        shopService.create(shopModel);

        return "redirect:/admin/shop/index";
    }

}
