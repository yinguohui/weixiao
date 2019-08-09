package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Page;
import com.xihua.weixiao.entity.Topic;
import com.xihua.weixiao.dao.TopicMapper;
import com.xihua.weixiao.service.TopicService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.utils.FileUtils;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.TopicRequest;
import com.xihua.weixiao.vo.response.TopicResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    private static final Logger LOGGER = LoggerFactory.getLogger(TopicServiceImpl.class);

    // 发表主题
    @Override
    public Integer addTopic(TopicRequest topicRequest, MultipartFile[] files,String filepath){
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
    public Integer deleteTopicById(IdRequest request) {
        return mapper.deleteById(request.getId());
    }

    // 查询所有主题
    @Override
    public List<Topic> queryTopicAll(Page page) {
        page.setEnd(page.getStart()+10);
        return mapper.queryTopicAll(page);
    }

    // 通过Id获得主题
    @Override
    public TopicResponse getTopicById(IdRequest idRequest) {
        return mapper.queryTopicResponse(idRequest);
    }

    // 得到我的主题
    @Override
    public List<Topic> getTopicByMe(IdRequest idRequest) {
        return mapper.queryMineTopic(idRequest);
    }

}
