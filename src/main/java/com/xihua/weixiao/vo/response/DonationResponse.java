package com.xihua.weixiao.vo.response;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

public class DonationResponse {
    private Integer donationId;
    private String donationName;
    private Integer doantionPlace;
    private Long doantionTime;
    private Integer donationNum;
    private String doantionDescrption;
    private Long donationCreateTime;

    public Integer getDonationId() {
        return donationId;
    }

    public void setDonationId(Integer donationId) {
        this.donationId = donationId;
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

    public Long getDonationCreateTime() {
        return donationCreateTime;
    }

    public void setDonationCreateTime(Long donationCreateTime) {
        this.donationCreateTime = donationCreateTime;
    }
}
