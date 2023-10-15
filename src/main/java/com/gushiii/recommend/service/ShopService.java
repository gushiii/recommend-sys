package com.gushiii.recommend.service;

import com.gushiii.recommend.common.BusinessException;
import com.gushiii.recommend.model.ShopModel;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


public interface ShopService {

    ShopModel create(ShopModel shopModel) throws BusinessException;
    ShopModel get(Integer id);
    List<ShopModel> selectAll();

    List<ShopModel> recommend(BigDecimal longitude, BigDecimal latitude);

    Integer countAllShop();

    List<ShopModel> search(BigDecimal longitude, BigDecimal latitude, String keyword, Integer orderby, Integer categoryId, String tags);

    List<Map<String, Object>> searchGroupByTags(String keyword, Integer categoryId, String tag);

}
