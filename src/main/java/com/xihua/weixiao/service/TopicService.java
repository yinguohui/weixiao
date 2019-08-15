package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.Topic;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.query.TopicQuery;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.TopicRequest;
import com.xihua.weixiao.vo.response.TopicDetailResponse;
import com.xihua.weixiao.vo.response.TopicTimeLine;
import com.xihua.weixiao.vo.response.TopicResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface TopicService extends IService<Topic> {
    public Integer addTopic(TopicRequest topicRequest, MultipartFile[] files, String filepath);
    public Integer deleteTopicById(IdRequest request);
    public List<TopicResponse> queryTopicAll(TopicQuery query);
    public TopicDetailResponse getTopicById(IdRequest idRequest);
    public List<Topic> getTopicByMe(IdRequest idRequest);
    public List<TopicTimeLine> quaryTimeTopic(IdRequest idRequest);
    public List<TopicResponse> queryMyTopicAll(IdRequest idRequest);
}
