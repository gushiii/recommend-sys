package com.gushiii.recommend.service.impl;

import com.gushiii.recommend.common.BusinessException;
import com.gushiii.recommend.common.EmBusinessError;
import com.gushiii.recommend.dal.CategoryModelMapper;
import com.gushiii.recommend.model.CategoryModel;
import com.gushiii.recommend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author : GUSHIII
 * @version : 1.0
 * @projectName : recommend-sys
 * @package : com.gushiii.recommend.service.impl
 * @className : CategoryServiceImpl
 * @description : TODO
 * @date : 2023/10/14 20:27
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryModelMapper categoryModelMapper;

    @Override
    @Transactional
    public CategoryModel create(CategoryModel categoryModel) throws BusinessException {

        categoryModel.setCreatedAt(new Date());
        categoryModel.setUpdateAt(new Date());
        try {
            categoryModelMapper.insertSelective(categoryModel);
        } catch (DuplicateKeyException duplicateKeyException) {
            throw new BusinessException(EmBusinessError.CATEGORY_NAME_DUPLICATED);
        }


        return get(categoryModel.getId());
    }

    @Override
    public CategoryModel get(Integer id) {
        return categoryModelMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CategoryModel> selectAll() {
        return categoryModelMapper.selectAll();
    }

    @Override
    public Integer countAllCategory() {
        return categoryModelMapper.countAllCategory();
    }
}
