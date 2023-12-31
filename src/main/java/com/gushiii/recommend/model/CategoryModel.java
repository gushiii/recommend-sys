package com.gushiii.recommend.model;

import java.util.Date;

public class CategoryModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.id
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.created_at
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.update_at
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    private Date updateAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.name
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.icon_url
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    private String iconUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.sort
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    private Integer sort;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.id
     *
     * @return the value of category.id
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.id
     *
     * @param id the value for category.id
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.created_at
     *
     * @return the value of category.created_at
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.created_at
     *
     * @param createdAt the value for category.created_at
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.update_at
     *
     * @return the value of category.update_at
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.update_at
     *
     * @param updateAt the value for category.update_at
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.name
     *
     * @return the value of category.name
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.name
     *
     * @param name the value for category.name
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.icon_url
     *
     * @return the value of category.icon_url
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.icon_url
     *
     * @param iconUrl the value for category.icon_url
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.sort
     *
     * @return the value of category.sort
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.sort
     *
     * @param sort the value for category.sort
     *
     * @mbg.generated Sat Oct 14 20:15:42 CST 2023
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}