package com.xihua.weixiao.dao;

import com.xihua.weixiao.entity.Chat;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xihua.weixiao.query.ChatQuery;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.ChatNumResponse;
import com.xihua.weixiao.vo.response.ChatResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface ChatMapper extends BaseMapper<Chat> {

   public List<ChatNumResponse> selectChatNum(IdRequest idRequest);
    public List<ChatResponse> selectChatContent(ChatQuery chatQuery);

    void updateChatStatus(@Param("receiveId") Integer receiveId);
}
