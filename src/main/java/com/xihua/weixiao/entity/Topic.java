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
@TableName("topic")
public class Topic implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "topic_id", type = IdType.AUTO)
    private Integer topicId;
    @TableField("topic_no")
    private String topicNo;
    @TableField("topic_content")
    private String topicContent;
    @TableField("topic_img")
    private String topicImg;
    @TableField("topic_like")
    private Integer topicLike;
    @TableField("topic_comment")
    private Integer topicComment;
    @TableField("topic_create_time")
    private Long topicCreateTime;
    @TableField("topic_status")
    private Integer topicStatus;
    @TableField("topic_user_id")
    private Integer topicUserId;


    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicNo() {
        return topicNo;
    }

    public void setTopicNo(String topicNo) {
        this.topicNo = topicNo;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }

    public String getTopicImg() {
        return topicImg;
    }

    public void setTopicImg(String topicImg) {
        this.topicImg = topicImg;
    }

    public Integer getTopicLike() {
        return topicLike;
    }

    public void setTopicLike(Integer topicLike) {
        this.topicLike = topicLike;
    }

    public Integer getTopicComment() {
        return topicComment;
    }

    public void setTopicComment(Integer topicComment) {
        this.topicComment = topicComment;
    }

    public Long getTopicCreateTime() {
        return topicCreateTime;
    }

    public void setTopicCreateTime(Long topicCreateTime) {
        this.topicCreateTime = topicCreateTime;
    }

    public Integer getTopicStatus() {
        return topicStatus;
    }

    public void setTopicStatus(Integer topicStatus) {
        this.topicStatus = topicStatus;
    }

    public Integer getTopicUserId() {
        return topicUserId;
    }

    public void setTopicUserId(Integer topicUserId) {
        this.topicUserId = topicUserId;
    }

    @Override
    public String toString() {
        return "Topic{" +
        ", topicId=" + topicId +
        ", topicNo=" + topicNo +
        ", topicContent=" + topicContent +
        ", topicImg=" + topicImg +
        ", topicLike=" + topicLike +
        ", topicComment=" + topicComment +
        ", topicCreateTime=" + topicCreateTime +
        ", topicStatus=" + topicStatus +
        ", topicUserId=" + topicUserId +
        "}";
    }
}
