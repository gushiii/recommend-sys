package com.gushiii.recommend.service;

import com.gushiii.recommend.common.BusinessException;
import com.gushiii.recommend.model.SellerModel;

import java.util.List;

public interface SellerService {

    SellerModel create(SellerModel sellerModel);
    SellerModel get(Integer id);
    List<SellerModel> selectAll();
    SellerModel changeStatus(Integer id, Integer disabledFlag) throws BusinessException;
}
