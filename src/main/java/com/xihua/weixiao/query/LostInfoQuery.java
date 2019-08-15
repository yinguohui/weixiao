package com.xihua.weixiao.query;

public class LostInfoQuery extends ObjectQuery{
    private Integer lostinfoUserId;

    private Integer lostType;

    public Integer getLostinfoUserId() {
        return lostinfoUserId;
    }

    public void setLostinfoUserId(Integer lostinfoUserId) {
        this.lostinfoUserId = lostinfoUserId;
    }

    public Integer getLostType() {
        return lostType;
    }

    public void setLostType(Integer lostType) {
        this.lostType = lostType;
    }
}
