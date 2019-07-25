package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Message;
import com.xihua.weixiao.dao.MessageMapper;
import com.xihua.weixiao.service.MessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

}
