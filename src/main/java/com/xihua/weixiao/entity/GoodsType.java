package com.xihua.weixiao.entity;

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
@TableName("goods_type")
public class GoodsType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("goods_type_id")
    private Integer goodsTypeId;
    @TableField("goods_type_no")
    private Integer goodsTypeNo;
    @TableField("goods_type_name")
    private String goodsTypeName;


    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public Integer getGoodsTypeNo() {
        return goodsTypeNo;
    }

    public void setGoodsTypeNo(Integer goodsTypeNo) {
        this.goodsTypeNo = goodsTypeNo;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
        ", goodsTypeId=" + goodsTypeId +
        ", goodsTypeNo=" + goodsTypeNo +
        ", goodsTypeName=" + goodsTypeName +
        "}";
    }
}
