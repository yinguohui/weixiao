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
@TableName("like_detail")
public class LikeDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "likedetail_id", type = IdType.AUTO)
    private Integer likedetailId;
    @TableField("likedetail_no")
    private String likedetailNo;
    @TableField("likedetail_user_id")
    private Integer likedetailUserId;
    @TableField("likedetail_topic_id")
    private Integer likedetailTopicId;
    @TableField("likedetail_status")
    private Integer likedetailStatus;
    @TableField("likedetail_create_time")
    private Long likedetailCreateTime;


    public Integer getLikedetailId() {
        return likedetailId;
    }

    public void setLikedetailId(Integer likedetailId) {
        this.likedetailId = likedetailId;
    }

    public String getLikedetailNo() {
        return likedetailNo;
    }

    public void setLikedetailNo(String likedetailNo) {
        this.likedetailNo = likedetailNo;
    }

    public Integer getLikedetailUserId() {
        return likedetailUserId;
    }

    public void setLikedetailUserId(Integer likedetailUserId) {
        this.likedetailUserId = likedetailUserId;
    }

    public Integer getLikedetailTopicId() {
        return likedetailTopicId;
    }

    public void setLikedetailTopicId(Integer likedetailTopicId) {
        this.likedetailTopicId = likedetailTopicId;
    }

    public Integer getLikedetailStatus() {
        return likedetailStatus;
    }

    public void setLikedetailStatus(Integer likedetailStatus) {
        this.likedetailStatus = likedetailStatus;
    }

    public Long getLikedetailCreateTime() {
        return likedetailCreateTime;
    }

    public void setLikedetailCreateTime(Long likedetailCreateTime) {
        this.likedetailCreateTime = likedetailCreateTime;
    }

    @Override
    public String toString() {
        return "LikeDetail{" +
        ", likedetailId=" + likedetailId +
        ", likedetailNo=" + likedetailNo +
        ", likedetailUserId=" + likedetailUserId +
        ", likedetailTopicId=" + likedetailTopicId +
        ", likedetailStatus=" + likedetailStatus +
        ", likedetailCreateTime=" + likedetailCreateTime +
        "}";
    }
}
