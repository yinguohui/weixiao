package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Page;
import com.xihua.weixiao.entity.Topic;
import com.xihua.weixiao.dao.TopicMapper;
import com.xihua.weixiao.service.TopicService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.TopicRequest;
import com.xihua.weixiao.vo.response.TopicResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @Resource
    private TopicMapper mapper;
    private static final Logger LOGGER = LoggerFactory.getLogger(TopicServiceImpl.class);

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
        //定义时间戳作为文件名的一部分吗，为了文件名不重复定义时间戳为文件名
        String tFileName = "topic/"+new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        File dir = new File(filepath, tFileName);
        String name = "";
        if(!dir.exists()){
            dir.mkdirs();
        }
        // MultipartFile自带的解析方法
        for (MultipartFile multipartFile:files) {
            File file = new File(filepath + "/" + tFileName + "/" + uuid + ".png");
            try {
                multipartFile.transferTo(file);
            } catch (IOException e) {
                LOGGER.info("转化文件失败",e);
            }
            name = name + "http://47.112.28.150:8080/templates/images/" + tFileName + "/" + file.getName() + "*&";
        }
        if (!name.equals("")){
            name = name.substring(0,name.length()-1);
        }
        return mapper.insert(topic);
    }

    @Override
    public Integer deleteTopicById(IdRequest request) {
        return mapper.deleteById(request.getId());
    }

    @Override
    public List<Topic> queryTopicAll(Page page) {
        page.setEnd(page.getStart()+10);
        return mapper.queryTopicAll(page);
    }

    @Override
    public TopicResponse getTopicById(IdRequest idRequest) {
        return mapper.queryTopicResponse(idRequest);
    }

    @Override
    public List<Topic> getTopicByMe(IdRequest idRequest) {
        return mapper.queryMineTopic(idRequest);
    }

}
