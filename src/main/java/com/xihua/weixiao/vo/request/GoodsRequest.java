package com.xihua.weixiao.vo.request;

public class GoodsRequest {
    private String goodsName;
    private String goodsPlace;
    private String goodsDesciption;
    private Integer goodsType;
    private Double goodsPrice;
    private Integer goodsUserNo;

    public Integer getGoodsUserNo() {
        return goodsUserNo;
    }

    public void setGoodsUserNo(Integer goodsUserNo) {
        this.goodsUserNo = goodsUserNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPlace() {
        return goodsPlace;
    }

    public void setGoodsPlace(String goodsPlace) {
        this.goodsPlace = goodsPlace;
    }

    public String getGoodsDesciption() {
        return goodsDesciption;
    }

    public void setGoodsDesciption(String goodsDesciption) {
        this.goodsDesciption = goodsDesciption;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}
