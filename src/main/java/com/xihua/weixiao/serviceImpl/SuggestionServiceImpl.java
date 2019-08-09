package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Lostinfo;
import com.xihua.weixiao.entity.Suggestion;
import com.xihua.weixiao.dao.SuggestionMapper;
import com.xihua.weixiao.query.SuggestionQuery;
import com.xihua.weixiao.service.SuggestionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.utils.FileUtils;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class SuggestionServiceImpl extends ServiceImpl<SuggestionMapper, Suggestion> implements SuggestionService {
    @Resource
    private FileUtils fileUtils;
    @Resource
    private SuggestionMapper mapper;
    private static final Logger LOGGER = LoggerFactory.getLogger(SuggestionServiceImpl.class);

    // 通过用户Id查询所有反馈
    @Override
    public List<Suggestion> getSuggestionByMyId(SuggestionQuery query) {
        return mapper.getSuggestionByMyId(query);
    }

    // 增加反馈意见
    @Override
    public int addSuggestion(Suggestion suggestion, MultipartFile[] files) {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        Suggestion suggestion1 = new Suggestion();
        suggestion1.setSuggestionCreateTime(System.currentTimeMillis());
        suggestion1.setSuggestionUserId(suggestion.getSuggestionUserId());
        suggestion1.setSuggestionNo(uuid);
        suggestion1.setSuggestionContent(suggestion.getSuggestionContent());
        suggestion1.setSuggestionStatus(1);
        String name = fileUtils.getUpUrl("suggestion",files);
        suggestion1.setSuggestionImg(name);
        return mapper.insert(suggestion1);
    }

    //通过ID删除反馈意见
    public int deledeSuggestionById(IdRequest idRequest){
        return mapper.deleteById(idRequest.getId());
    }

    //查询所有用户意见
}
