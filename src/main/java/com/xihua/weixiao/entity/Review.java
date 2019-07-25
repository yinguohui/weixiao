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
@TableName("review")
public class Review implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "review_id", type = IdType.AUTO)
    private Integer reviewId;
    @TableField("review_no")
    private String reviewNo;
    @TableField("review_content")
    private String reviewContent;
    @TableField("review_topic_id")
    private Integer reviewTopicId;
    @TableField("review_user_id")
    private Integer reviewUserId;
    @TableField("review_create_time")
    private Long reviewCreateTime;
    @TableField("review_status")
    private Integer reviewStatus;


    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewNo() {
        return reviewNo;
    }

    public void setReviewNo(String reviewNo) {
        this.reviewNo = reviewNo;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public Integer getReviewTopicId() {
        return reviewTopicId;
    }

    public void setReviewTopicId(Integer reviewTopicId) {
        this.reviewTopicId = reviewTopicId;
    }

    public Integer getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(Integer reviewUserId) {
        this.reviewUserId = reviewUserId;
    }

    public Long getReviewCreateTime() {
        return reviewCreateTime;
    }

    public void setReviewCreateTime(Long reviewCreateTime) {
        this.reviewCreateTime = reviewCreateTime;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    @Override
    public String toString() {
        return "Review{" +
        ", reviewId=" + reviewId +
        ", reviewNo=" + reviewNo +
        ", reviewContent=" + reviewContent +
        ", reviewTopicId=" + reviewTopicId +
        ", reviewUserId=" + reviewUserId +
        ", reviewCreateTime=" + reviewCreateTime +
        ", reviewStatus=" + reviewStatus +
        "}";
    }
}
