package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.Message;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.MessageRequest;
import com.xihua.weixiao.vo.response.MessageResponse;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface MessageService extends IService<Message> {

    public void addMessage(MessageRequest request);

    public List<MessageResponse> selectByUserId(IdRequest idRequest);
}
