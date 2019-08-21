package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Chat;
import com.xihua.weixiao.dao.ChatMapper;
import com.xihua.weixiao.query.ChatQuery;
import com.xihua.weixiao.service.ChatService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.utils.BeanPropertiesCopyUtils;
import com.xihua.weixiao.vo.request.ChatRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.ChatAllResponse;
import com.xihua.weixiao.vo.response.ChatNumResponse;
import com.xihua.weixiao.vo.response.ChatResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
@Service
public class ChatServiceImpl extends ServiceImpl<ChatMapper, Chat> implements ChatService {
    @Resource
    private ChatMapper chatMapper;

    @Override
    public int addChat(ChatRequest request) {
        Chat chat = new Chat();
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        BeanPropertiesCopyUtils.copyProperties(request,chat);
        chat.setChatNo(uuid);
        chat.setChatCreateTime(System.currentTimeMillis());
        chat.setChatStatus(1);
        return chatMapper.insert(chat);
    }

    @Override
    public List<ChatNumResponse> selectChatNum(IdRequest idRequest) {
        return chatMapper.selectChatNum(idRequest);
    }

    @Override
    public List<ChatResponse> queryChatContent(ChatQuery query) {
        return chatMapper.selectChatContent(query);
    }

    @Override
    public List<ChatAllResponse> getAllChatById(IdRequest idRequest) {
        return chatMapper.getAllChatById(idRequest);
    }

    @Override
    public List<ChatAllResponse> getChatContent(ChatQuery chatQuery) {
        return chatMapper.getChatContent(chatQuery);
    }

    @Override
    public int deleteByUserId(ChatQuery chatQuery) {
        return chatMapper.deleteByUserId(chatQuery);
    }

}
