package com.gushiii.recommend.service;

import com.gushiii.recommend.common.BusinessException;
import com.gushiii.recommend.model.CategoryModel;

import java.util.List;

public interface CategoryService {

    CategoryModel create(CategoryModel categoryModel) throws BusinessException;
    CategoryModel get(Integer id);
    List<CategoryModel> selectAll();

    Integer countAllCategory();


}
