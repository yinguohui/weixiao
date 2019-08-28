package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.Chat;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.query.ChatQuery;
import com.xihua.weixiao.vo.request.ChatRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.ChatAllResponse;
import com.xihua.weixiao.vo.response.ChatAllUserResponse;
import com.xihua.weixiao.vo.response.ChatNumResponse;
import com.xihua.weixiao.vo.response.ChatResponse;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface ChatService extends IService<Chat> {

    public int addChat(ChatRequest request);

    public List<ChatNumResponse> selectChatNum(IdRequest idRequest);

    List<ChatResponse> queryChatContent(ChatQuery query);

    List<ChatAllResponse> getAllChatById(IdRequest idRequest);

    List<ChatAllResponse> getChatContent(ChatQuery chatQuery);

    int deleteByUserId(ChatQuery chatQuery);

    List<ChatAllUserResponse> selectAllChatUser(IdRequest idRequest);
}
