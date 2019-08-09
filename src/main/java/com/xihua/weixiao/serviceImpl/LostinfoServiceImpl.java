package com.xihua.weixiao.serviceImpl;

import com.baomidou.mybatisplus.plugins.Page;
import com.xihua.weixiao.entity.Lostinfo;
import com.xihua.weixiao.dao.LostinfoMapper;
import com.xihua.weixiao.entity.Topic;
import com.xihua.weixiao.service.LostinfoService;
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
public class LostinfoServiceImpl extends ServiceImpl<LostinfoMapper, Lostinfo> implements LostinfoService {
    @Value("server.url")
    private String serverUrl;
    @Resource
    private FileUtils fileUtils;
    @Resource
    private LostinfoMapper mapper;
    private static final Logger LOGGER = LoggerFactory.getLogger(LostinfoServiceImpl.class);

    @Override
    public int addLostinfo(Lostinfo lostinfo, MultipartFile[] files, String filepath) {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        Lostinfo lostinfo1 = new Lostinfo();
        lostinfo1.setLostinfoNo(uuid);
        lostinfo1.setLostinfoStatus(1);
        lostinfo1.setLostinfoPlace(0);
        lostinfo1.setLostinfoType(0);
        lostinfo1.setLostinfoName(lostinfo.getLostinfoName());
        lostinfo1.setLostinfoCreateTime(System.currentTimeMillis());
        lostinfo1.setLostinfoUserId(lostinfo.getLostinfoUserId());
        lostinfo1.setLostinfoStatus(1);
        lostinfo1.setLostinfoDescription(lostinfo.getLostinfoDescription());
        String name = fileUtils.getUpUrl("lostinfo",files);
        lostinfo1.setLostinfoImg(name);
        return mapper.insert(lostinfo1);
    }

    @Override
    public int deleteLostinfo(IdRequest idRequest) {
        return mapper.deleteById(idRequest.getId());
    }

    @Override
    public List<Lostinfo> queryLostinfo(IdQueryRequest idRequest) {
        return mapper.queryLostinfo(idRequest);
    }
}
