package com.gushiii.recommend.service;

import com.gushiii.recommend.common.BusinessException;
import com.gushiii.recommend.model.ShopModel;

import java.math.BigDecimal;
import java.util.List;

public interface ShopService {

    ShopModel create(ShopModel shopModel) throws BusinessException;
    ShopModel get(Integer id);
    List<ShopModel> selectAll();

    List<ShopModel> recommend(BigDecimal longitude, BigDecimal latitude);

    Integer countAllShop();

}
