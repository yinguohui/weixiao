package com.xihua.weixiao.dao;

import com.xihua.weixiao.entity.Topic;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xihua.weixiao.query.TopicQuery;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.TopicDetailResponse;
import com.xihua.weixiao.vo.response.TopicTimeLine;
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
    public List<TopicResponse> queryTopicAll();
    public List<Topic> queryMineTopic(IdRequest idRequest);
    public List<TopicTimeLine> quaryTimeTopic(IdRequest idRequest);
    public TopicDetailResponse getTopicById(IdRequest idRequest);
}
