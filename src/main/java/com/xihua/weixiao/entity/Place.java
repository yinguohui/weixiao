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
@TableName("place")
public class Place implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("place_id")
    private Integer placeId;
    @TableField("place_no")
    private String placeNo;
    @TableField("place_name")
    private String placeName;
    @TableField("place_parent_id")
    private Integer placeParentId;
    @TableField("place_create_time")
    private Long placeCreateTime;
    @TableField("place_status")
    private Integer placeStatus;
    @TableField("place_user_id")
    private Integer placeUserId;


    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public String getPlaceNo() {
        return placeNo;
    }

    public void setPlaceNo(String placeNo) {
        this.placeNo = placeNo;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public Integer getPlaceParentId() {
        return placeParentId;
    }

    public void setPlaceParentId(Integer placeParentId) {
        this.placeParentId = placeParentId;
    }

    public Long getPlaceCreateTime() {
        return placeCreateTime;
    }

    public void setPlaceCreateTime(Long placeCreateTime) {
        this.placeCreateTime = placeCreateTime;
    }

    public Integer getPlaceStatus() {
        return placeStatus;
    }

    public void setPlaceStatus(Integer placeStatus) {
        this.placeStatus = placeStatus;
    }

    public Integer getPlaceUserId() {
        return placeUserId;
    }

    public void setPlaceUserId(Integer placeUserId) {
        this.placeUserId = placeUserId;
    }

    @Override
    public String toString() {
        return "Place{" +
        ", placeId=" + placeId +
        ", placeNo=" + placeNo +
        ", placeName=" + placeName +
        ", placeParentId=" + placeParentId +
        ", placeCreateTime=" + placeCreateTime +
        ", placeStatus=" + placeStatus +
        ", placeUserId=" + placeUserId +
        "}";
    }
}
