package com.xihua.weixiao.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
@TableName("goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "goods_id", type = IdType.AUTO)
    private Integer goodsId;
    @TableField("goods_no")
    private String goodsNo;
    @TableField("goods_name")
    private String goodsName;
    @TableField("goods_img")
    private String goodsImg;
    @TableField("goods_price")
    private Double goodsPrice;
    @TableField("goods_desciption")
    private String goodsDesciption;
    /**
     * 1为出售状态
     */
    @TableField("goods_status")
    private Integer goodsStatus;
    @TableField("goods_user_no")
    private Integer goodsUserNo;
    @TableField("goods_type")
    private Integer goodsType;
    @TableField("goods_num")
    private Integer goodsNum;
    @TableField("goods_create_time")
    private Long goodsCreateTime;


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsDesciption() {
        return goodsDesciption;
    }

    public void setGoodsDesciption(String goodsDesciption) {
        this.goodsDesciption = goodsDesciption;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getGoodsUserNo() {
        return goodsUserNo;
    }

    public void setGoodsUserNo(Integer goodsUserNo) {
        this.goodsUserNo = goodsUserNo;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Long getGoodsCreateTime() {
        return goodsCreateTime;
    }

    public void setGoodsCreateTime(Long goodsCreateTime) {
        this.goodsCreateTime = goodsCreateTime;
    }

    @Override
    public String toString() {
        return "Goods{" +
        ", goodsId=" + goodsId +
        ", goodsNo=" + goodsNo +
        ", goodsName=" + goodsName +
        ", goodsImg=" + goodsImg +
        ", goodsPrice=" + goodsPrice +
        ", goodsDesciption=" + goodsDesciption +
        ", goodsStatus=" + goodsStatus +
        ", goodsUserNo=" + goodsUserNo +
        ", goodsType=" + goodsType +
        ", goodsNum=" + goodsNum +
        ", goodsCreateTime=" + goodsCreateTime +
        "}";
    }
}
