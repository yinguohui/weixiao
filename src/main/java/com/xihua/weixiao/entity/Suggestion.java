package com.xihua.weixiao.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
@TableName("suggestion")
public class Suggestion implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(type= IdType.AUTO)
    private int suggestionId;
    @TableField("suggestion_no")
    private String suggestionNo;
    @TableField("suggestion_content")
    private String suggestionContent;
    @TableField("suggestion_img")
    private String suggestionImg;
    @TableField("suggestion_user_id")
    private Integer suggestionUserId;
    @TableField("suggestion_create_time")
    private Long suggestionCreateTime;
    @TableField("suggestion_status")
    private Integer suggestionStatus;


    public Integer getSuggestionId() {
        return suggestionId;
    }

    public void setSuggestionId(Integer suggestionId) {
        this.suggestionId = suggestionId;
    }

    public String getSuggestionNo() {
        return suggestionNo;
    }

    public void setSuggestionNo(String suggestionNo) {
        this.suggestionNo = suggestionNo;
    }

    public String getSuggestionContent() {
        return suggestionContent;
    }

    public void setSuggestionContent(String suggestionContent) {
        this.suggestionContent = suggestionContent;
    }

    public String getSuggestionImg() {
        return suggestionImg;
    }

    public void setSuggestionImg(String suggestionImg) {
        this.suggestionImg = suggestionImg;
    }

    public Integer getSuggestionUserId() {
        return suggestionUserId;
    }

    public void setSuggestionUserId(Integer suggestionUserId) {
        this.suggestionUserId = suggestionUserId;
    }

    public Long getSuggestionCreateTime() {
        return suggestionCreateTime;
    }

    public void setSuggestionCreateTime(Long suggestionCreateTime) {
        this.suggestionCreateTime = suggestionCreateTime;
    }

    public Integer getSuggestionStatus() {
        return suggestionStatus;
    }

    public void setSuggestionStatus(Integer suggestionStatus) {
        this.suggestionStatus = suggestionStatus;
    }

    @Override
    public String toString() {
        return "Suggestion{" +
        ", suggestionId=" + suggestionId +
        ", suggestionNo=" + suggestionNo +
        ", suggestionContent=" + suggestionContent +
        ", suggestionImg=" + suggestionImg +
        ", suggestionUserId=" + suggestionUserId +
        ", suggestionCreateTime=" + suggestionCreateTime +
        ", suggestionStatus=" + suggestionStatus +
        "}";
    }
}
