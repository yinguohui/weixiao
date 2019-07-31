package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.Page;
import com.xihua.weixiao.entity.Topic;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.TopicRequest;
import com.xihua.weixiao.vo.response.TopicResponse;
import org.apache.ibatis.session.RowBounds;
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
    public List<Topic> queryTopicAll(Page page);
    public TopicResponse getTopicById(IdRequest idRequest);
    public List<Topic> getTopicByMe(IdRequest idRequest);
}
