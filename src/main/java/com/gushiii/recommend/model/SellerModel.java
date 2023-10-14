package com.gushiii.recommend.model;

import java.math.BigDecimal;
import java.util.Date;

public class SellerModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.id
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.name
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.create_at
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.updata_at
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    private Date updataAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.remark_score
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    private BigDecimal remarkScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.disabled_flag
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    private Integer disabledFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.id
     *
     * @return the value of seller.id
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.id
     *
     * @param id the value for seller.id
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.name
     *
     * @return the value of seller.name
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.name
     *
     * @param name the value for seller.name
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.create_at
     *
     * @return the value of seller.create_at
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.create_at
     *
     * @param createAt the value for seller.create_at
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.updata_at
     *
     * @return the value of seller.updata_at
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    public Date getUpdataAt() {
        return updataAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.updata_at
     *
     * @param updataAt the value for seller.updata_at
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    public void setUpdataAt(Date updataAt) {
        this.updataAt = updataAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.remark_score
     *
     * @return the value of seller.remark_score
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    public BigDecimal getRemarkScore() {
        return remarkScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.remark_score
     *
     * @param remarkScore the value for seller.remark_score
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    public void setRemarkScore(BigDecimal remarkScore) {
        this.remarkScore = remarkScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.disabled_flag
     *
     * @return the value of seller.disabled_flag
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    public Integer getDisabledFlag() {
        return disabledFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.disabled_flag
     *
     * @param disabledFlag the value for seller.disabled_flag
     *
     * @mbg.generated Sat Oct 14 17:20:19 CST 2023
     */
    public void setDisabledFlag(Integer disabledFlag) {
        this.disabledFlag = disabledFlag;
    }
}