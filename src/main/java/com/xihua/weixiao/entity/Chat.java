package com.xihua.weixiao.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
@TableName("chat")
public class Chat implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value ="chat_id",type = IdType.AUTO)
    private Integer chatId;
    @TableField("chat_no")
    private String chatNo;
    @TableField("chat_send_id")
    private Integer chatSendId;
    @TableField("chat_revice_id")
    private Integer chatReviceId;
    @TableField("chat_content")
    private String chatContent;
    @TableField("chat_status")
    private Integer chatStatus;
    @TableField("chat_create_time")
    private Long chatCreateTime;


    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public String getChatNo() {
        return chatNo;
    }

    public void setChatNo(String chatNo) {
        this.chatNo = chatNo;
    }

    public Integer getChatSendId() {
        return chatSendId;
    }

    public void setChatSendId(Integer chatSendId) {
        this.chatSendId = chatSendId;
    }

    public Integer getChatReviceId() {
        return chatReviceId;
    }

    public void setChatReviceId(Integer chatReviceId) {
        this.chatReviceId = chatReviceId;
    }

    public String getChatContent() {
        return chatContent;
    }

    public void setChatContent(String chatContent) {
        this.chatContent = chatContent;
    }

    public Integer getChatStatus() {
        return chatStatus;
    }

    public void setChatStatus(Integer chatStatus) {
        this.chatStatus = chatStatus;
    }

    public Long getChatCreateTime() {
        return chatCreateTime;
    }

    public void setChatCreateTime(Long chatCreateTime) {
        this.chatCreateTime = chatCreateTime;
    }

    @Override
    public String toString() {
        return "Chat{" +
        ", chatId=" + chatId +
        ", chatNo=" + chatNo +
        ", chatSendId=" + chatSendId +
        ", chatReviceId=" + chatReviceId +
        ", chatContent=" + chatContent +
        ", chatStatus=" + chatStatus +
        ", chatCreateTime=" + chatCreateTime +
        "}";
    }
}
