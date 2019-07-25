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
@TableName("lostinfo")
public class Lostinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "lostinfo_id", type = IdType.AUTO)
    private Integer lostinfoId;
    @TableField("lostinfo_no")
    private String lostinfoNo;
    @TableField("lostinfo_name")
    private String lostinfoName;
    @TableField("lostinfo_description")
    private String lostinfoDescription;
    @TableField("lostinfo_img")
    private String lostinfoImg;
    @TableField("lostinfo_status")
    private Integer lostinfoStatus;
    @TableField("lostinfo_place")
    private Integer lostinfoPlace;
    @TableField("lostinfo_type")
    private Integer lostinfoType;
    @TableField("lostinfo_create_time")
    private Long lostinfoCreateTime;
    @TableField("lostinfo_user_id")
    private Integer lostinfoUserId;


    public Integer getLostinfoId() {
        return lostinfoId;
    }

    public void setLostinfoId(Integer lostinfoId) {
        this.lostinfoId = lostinfoId;
    }

    public String getLostinfoNo() {
        return lostinfoNo;
    }

    public void setLostinfoNo(String lostinfoNo) {
        this.lostinfoNo = lostinfoNo;
    }

    public String getLostinfoName() {
        return lostinfoName;
    }

    public void setLostinfoName(String lostinfoName) {
        this.lostinfoName = lostinfoName;
    }

    public String getLostinfoDescription() {
        return lostinfoDescription;
    }

    public void setLostinfoDescription(String lostinfoDescription) {
        this.lostinfoDescription = lostinfoDescription;
    }

    public String getLostinfoImg() {
        return lostinfoImg;
    }

    public void setLostinfoImg(String lostinfoImg) {
        this.lostinfoImg = lostinfoImg;
    }

    public Integer getLostinfoStatus() {
        return lostinfoStatus;
    }

    public void setLostinfoStatus(Integer lostinfoStatus) {
        this.lostinfoStatus = lostinfoStatus;
    }

    public Integer getLostinfoPlace() {
        return lostinfoPlace;
    }

    public void setLostinfoPlace(Integer lostinfoPlace) {
        this.lostinfoPlace = lostinfoPlace;
    }

    public Integer getLostinfoType() {
        return lostinfoType;
    }

    public void setLostinfoType(Integer lostinfoType) {
        this.lostinfoType = lostinfoType;
    }

    public Long getLostinfoCreateTime() {
        return lostinfoCreateTime;
    }

    public void setLostinfoCreateTime(Long lostinfoCreateTime) {
        this.lostinfoCreateTime = lostinfoCreateTime;
    }

    public Integer getLostinfoUserId() {
        return lostinfoUserId;
    }

    public void setLostinfoUserId(Integer lostinfoUserId) {
        this.lostinfoUserId = lostinfoUserId;
    }

    @Override
    public String toString() {
        return "Lostinfo{" +
        ", lostinfoId=" + lostinfoId +
        ", lostinfoNo=" + lostinfoNo +
        ", lostinfoName=" + lostinfoName +
        ", lostinfoDescription=" + lostinfoDescription +
        ", lostinfoImg=" + lostinfoImg +
        ", lostinfoStatus=" + lostinfoStatus +
        ", lostinfoPlace=" + lostinfoPlace +
        ", lostinfoType=" + lostinfoType +
        ", lostinfoCreateTime=" + lostinfoCreateTime +
        ", lostinfoUserId=" + lostinfoUserId +
        "}";
    }
}
