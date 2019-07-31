package com.xihua.weixiao.dao;

import com.xihua.weixiao.entity.Page;
import com.xihua.weixiao.entity.Topic;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.TopicResponse;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface TopicMapper extends BaseMapper<Topic> {
    public List<Topic> queryTopicAll(Page page);
    public TopicResponse queryTopicResponse(IdRequest idRequest);
    public List<Topic> queryMineTopic(IdRequest idRequest);
}
