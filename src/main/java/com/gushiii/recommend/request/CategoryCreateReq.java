package com.gushiii.recommend.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author : GUSHIII
 * @version : 1.0
 * @projectName : recommend-sys
 * @package : com.gushiii.recommend.request
 * @className : CategoryCreateReq
 * @description : TODO
 * @date : 2023/10/14 20:45
 */
public class CategoryCreateReq {

    @NotBlank(message = "商户名称不能为空")
    private String name;

    @NotBlank(message = "icon不能为空")
    private String iconUrl;

    @NotNull(message = "排序不能为空")
    private Integer sort;

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
