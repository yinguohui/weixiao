package com.xihua.weixiao.vo.request;

public class LostinfoRequest {
    private String lostinfoName;
    private String lostinfoDescription;
    private Integer lostinfoPlace;
    private Integer lostinfoType;
    private Integer lostinfoUserId;

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

    public Integer getLostinfoUserId() {
        return lostinfoUserId;
    }

    public void setLostinfoUserId(Integer lostinfoUserId) {
        this.lostinfoUserId = lostinfoUserId;
    }
}
