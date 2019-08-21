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
@TableName("donation")
public class Donation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("donation_id")
    private int donationId;
    @TableField("donation_no")
    private String donationNo;
    @TableField("donation_name")
    private String donationName;
    @TableField("doantion_place")
    private Integer doantionPlace;
    @TableField("doantion_time")
    private Long doantionTime;
    @TableField("donation_num")
    private Integer donationNum;
    @TableField("doantion_descrption")
    private String doantionDescrption;
    @TableField("doantion_status")
    private Integer doantionStatus;
    @TableField("donation_user_id")
    private Integer donationUserId;
    @TableField("donation_create_time")
    private Long donationCreateTime;
    @TableField("donation_img")
    private String donationImg;

    public String getDonationImg() {
        return donationImg;
    }

    public void setDonationImg(String donationImg) {
        this.donationImg = donationImg;
    }

    public int getDonationId() {
        return donationId;
    }

    public void setDonationId(int donationId) {
        this.donationId = donationId;
    }

    public String getDonationNo() {
        return donationNo;
    }

    public void setDonationNo(String donationNo) {
        this.donationNo = donationNo;
    }

    public String getDonationName() {
        return donationName;
    }

    public void setDonationName(String donationName) {
        this.donationName = donationName;
    }

    public Integer getDoantionPlace() {
        return doantionPlace;
    }

    public void setDoantionPlace(Integer doantionPlace) {
        this.doantionPlace = doantionPlace;
    }

    public Long getDoantionTime() {
        return doantionTime;
    }

    public void setDoantionTime(Long doantionTime) {
        this.doantionTime = doantionTime;
    }

    public Integer getDonationNum() {
        return donationNum;
    }

    public void setDonationNum(Integer donationNum) {
        this.donationNum = donationNum;
    }

    public String getDoantionDescrption() {
        return doantionDescrption;
    }

    public void setDoantionDescrption(String doantionDescrption) {
        this.doantionDescrption = doantionDescrption;
    }

    public Integer getDoantionStatus() {
        return doantionStatus;
    }

    public void setDoantionStatus(Integer doantionStatus) {
        this.doantionStatus = doantionStatus;
    }

    public Integer getDonationUserId() {
        return donationUserId;
    }

    public void setDonationUserId(Integer donationUserId) {
        this.donationUserId = donationUserId;
    }

    public Long getDonationCreateTime() {
        return donationCreateTime;
    }

    public void setDonationCreateTime(Long donationCreateTime) {
        this.donationCreateTime = donationCreateTime;
    }

    @Override
    public String toString() {
        return "Donation{" +
        ", donationId=" + donationId +
        ", donationNo=" + donationNo +
        ", donationName=" + donationName +
        ", doantionPlace=" + doantionPlace +
        ", doantionTime=" + doantionTime +
        ", donationNum=" + donationNum +
        ", doantionDescrption=" + doantionDescrption +
        ", doantionStatus=" + doantionStatus +
        ", donationUserId=" + donationUserId +
        ", donationCreateTime=" + donationCreateTime +
        "}";
    }
}
