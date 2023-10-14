package com.gushiii.recommend.request;

import javax.validation.constraints.NotBlank;

/**
 * @author : GUSHIII
 * @version : 1.0
 * @projectName : recommend-sys
 * @package : com.gushiii.recommend.request
 * @className : SellerCreateReq
 * @description : TODO
 * @date : 2023/10/14 18:49
 */
public class SellerCreateReq {
    @NotBlank(message = "商户名称不能为空")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
