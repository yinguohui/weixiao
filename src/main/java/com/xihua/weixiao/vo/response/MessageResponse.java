package com.xihua.weixiao.vo.response;

import com.xihua.weixiao.entity.User;

/**
 * <p>
 * 
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public class MessageResponse {

    private Integer messageId;
    private String messageContent;
    private Long messageCreateTime;
    private User user;

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

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
