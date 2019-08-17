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
public class ChatResponse  {

    private Integer chatId;
    private String chatContent;
    private Long chatCreateTime;
    private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public String getChatContent() {
        return chatContent;
    }

    public void setChatContent(String chatContent) {
        this.chatContent = chatContent;
    }

    public Long getChatCreateTime() {
        return chatCreateTime;
    }

    public void setChatCreateTime(Long chatCreateTime) {
        this.chatCreateTime = chatCreateTime;
    }


}
