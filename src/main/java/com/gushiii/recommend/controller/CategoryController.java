package com.gushiii.recommend.controller;

import com.gushiii.recommend.common.CommonRes;
import com.gushiii.recommend.model.CategoryModel;
import com.gushiii.recommend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : GUSHIII
 * @version : 1.0
 * @projectName : recommend-sys
 * @package : com.gushiii.recommend.controller
 * @className : CategoryController
 * @description : TODO
 * @date : 2023/10/14 21:18
 */
@Controller("/category")
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/list")
    @ResponseBody
    public CommonRes list() {
        List<CategoryModel> categoryModels = categoryService.selectAll();
        return CommonRes.create(categoryModels);
    }

}
