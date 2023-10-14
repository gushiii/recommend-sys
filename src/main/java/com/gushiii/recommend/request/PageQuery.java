package com.gushiii.recommend.request;

/**
 * @author : GUSHIII
 * @version : 1.0
 * @projectName : recommend-sys
 * @package : com.gushiii.recommend.request
 * @className : PageQuery
 * @description : TODO
 * @date : 2023/10/14 19:06
 */
public class PageQuery {

    private Integer page = 1;
    private Integer size = 1;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
