package com.xihua.weixiao.vo.response;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.xihua.weixiao.entity.User;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public class LostinfoResponse  {
    private Integer lostinfoId;
    private String lostinfoName;
    private String lostinfoDescription;
    private String lostinfoImg;
    private Integer lostinfoStatus;
    private Integer lostinfoPlace;
    private Long lostinfoCreateTime;
    private Integer lostinfoUserId;
    private User user;


    public Integer getLostinfoId() {
        return lostinfoId;
    }

    public void setLostinfoId(Integer lostinfoId) {
        this.lostinfoId = lostinfoId;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
