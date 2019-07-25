package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Chat;
import com.xihua.weixiao.dao.ChatMapper;
import com.xihua.weixiao.service.ChatService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
