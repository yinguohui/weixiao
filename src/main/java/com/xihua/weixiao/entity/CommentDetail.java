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
@TableName("comment_detail")
public class CommentDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("comment_detail_id")
    private Integer commentDetailId;
    @TableField("comment_detail_no")
    private String commentDetailNo;
    @TableField("comment_detail_user_id")
    private Integer commentDetailUserId;
    @TableField("comment_detail_topic_id")
    private Integer commentDetailTopicId;
    @TableField("comment_detail_create_time")
    private Long commentDetailCreateTime;
    @TableField("comment_detail_status")
    private Integer commentDetailStatus;


    public Integer getCommentDetailId() {
        return commentDetailId;
    }

    public void setCommentDetailId(Integer commentDetailId) {
        this.commentDetailId = commentDetailId;
    }

    public String getCommentDetailNo() {
        return commentDetailNo;
    }

    public void setCommentDetailNo(String commentDetailNo) {
        this.commentDetailNo = commentDetailNo;
    }

    public Integer getCommentDetailUserId() {
        return commentDetailUserId;
    }

    public void setCommentDetailUserId(Integer commentDetailUserId) {
        this.commentDetailUserId = commentDetailUserId;
    }

    public Integer getCommentDetailTopicId() {
        return commentDetailTopicId;
    }

    public void setCommentDetailTopicId(Integer commentDetailTopicId) {
        this.commentDetailTopicId = commentDetailTopicId;
    }

    public Long getCommentDetailCreateTime() {
        return commentDetailCreateTime;
    }

    public void setCommentDetailCreateTime(Long commentDetailCreateTime) {
        this.commentDetailCreateTime = commentDetailCreateTime;
    }

    public Integer getCommentDetailStatus() {
        return commentDetailStatus;
    }

    public void setCommentDetailStatus(Integer commentDetailStatus) {
        this.commentDetailStatus = commentDetailStatus;
    }

    @Override
    public String toString() {
        return "CommentDetail{" +
        ", commentDetailId=" + commentDetailId +
        ", commentDetailNo=" + commentDetailNo +
        ", commentDetailUserId=" + commentDetailUserId +
        ", commentDetailTopicId=" + commentDetailTopicId +
        ", commentDetailCreateTime=" + commentDetailCreateTime +
        ", commentDetailStatus=" + commentDetailStatus +
        "}";
    }
}
