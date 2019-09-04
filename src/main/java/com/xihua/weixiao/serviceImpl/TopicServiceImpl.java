package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.dao.CommentDetailMapper;
import com.xihua.weixiao.dao.LikeDetailMapper;
import com.xihua.weixiao.dao.ReviewMapper;
import com.xihua.weixiao.entity.Topic;
import com.xihua.weixiao.dao.TopicMapper;
import com.xihua.weixiao.query.TopicQuery;
import com.xihua.weixiao.service.TopicService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.utils.FileUtils;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.TopicRequest;
import com.xihua.weixiao.vo.response.TopicDetailResponse;
import com.xihua.weixiao.vo.response.TopicTimeLine;
import com.xihua.weixiao.vo.response.TopicResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

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
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic> implements TopicService {

    @Autowired
    private FileUtils fileUtils;
    @Resource
    private TopicMapper mapper;
    @Resource
    private ReviewMapper reviewMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(TopicServiceImpl.class);

    // 发表主题
    @Override
    public Integer addTopic(TopicRequest topicRequest, MultipartFile[] files){
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        Topic topic = new Topic();
        topic.setTopicNo(uuid);
        topic.setTopicLike(0);
        topic.setTopicStatus(1);
        topic.setTopicUserId(topicRequest.getTopicUserId());
        topic.setTopicComment(0);
        topic.setTopicContent(topicRequest.getTopicContent());
        topic.setTopicCreateTime(System.currentTimeMillis());
        String name = fileUtils.getUpUrl("topic/",files);
        topic.setTopicImg(name);
        return mapper.insert(topic);
    }

    // 通过Id删除主题
    @Override
    @Transactional
    public Integer deleteTopicById(IdRequest request) {
        reviewMapper.deleteReviewByTopicId(request);
        return mapper.deleteById(request.getId());
    }

    // 查询所有主题
    @Override
    public List<TopicResponse> queryTopicAll() {
        return mapper.queryTopicAll();
    }

    // 通过Id获得主题
    @Override
    public TopicDetailResponse getTopicById(IdRequest idRequest) {
        return mapper.getTopicById(idRequest);
    }

    // 得到我的主题
    @Override
    public List<Topic> getTopicByMe(IdRequest idRequest) {
        return mapper.queryMineTopic(idRequest);
    }

    @Override
    public List<TopicTimeLine> quaryTimeTopic(IdRequest idRequest) {
        return mapper.quaryTimeTopic(idRequest);
    }


}
