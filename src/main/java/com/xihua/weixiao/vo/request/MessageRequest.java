package com.xihua.weixiao.vo.request;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("message")
public class MessageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("message_id")
    private Integer messageId;
    @TableField("message_no")
    private String messageNo;
    @TableField("message_send_id")
    private Integer messageSendId;
    @TableField("message_receive_id")
    private Integer messageReceiveId;
    @TableField("message_content")
    private String messageContent;
    @TableField("message_create_time")
    private Long messageCreateTime;
    @TableField("message_status")
    private Integer messageStatus;
    @TableField("message_prepare")
    private String messagePrepare;


    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessageNo() {
        return messageNo;
    }

    public void setMessageNo(String messageNo) {
        this.messageNo = messageNo;
    }

    public Integer getMessageSendId() {
        return messageSendId;
    }

    public void setMessageSendId(Integer messageSendId) {
        this.messageSendId = messageSendId;
    }

    public Integer getMessageReceiveId() {
        return messageReceiveId;
    }

    public void setMessageReceiveId(Integer messageReceiveId) {
        this.messageReceiveId = messageReceiveId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Long getMessageCreateTime() {
        return messageCreateTime;
    }

    public void setMessageCreateTime(Long messageCreateTime) {
        this.messageCreateTime = messageCreateTime;
    }

    public Integer getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(Integer messageStatus) {
        this.messageStatus = messageStatus;
    }

    public String getMessagePrepare() {
        return messagePrepare;
    }

    public void setMessagePrepare(String messagePrepare) {
        this.messagePrepare = messagePrepare;
    }

    @Override
    public String toString() {
        return "Message{" +
        ", messageId=" + messageId +
        ", messageNo=" + messageNo +
        ", messageSendId=" + messageSendId +
        ", messageReceiveId=" + messageReceiveId +
        ", messageContent=" + messageContent +
        ", messageCreateTime=" + messageCreateTime +
        ", messageStatus=" + messageStatus +
        ", messagePrepare=" + messagePrepare +
        "}";
    }
}
