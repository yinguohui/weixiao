package com.xihua.weixiao.serviceImpl;

import com.baomidou.mybatisplus.plugins.Page;
import com.xihua.weixiao.entity.Lostinfo;
import com.xihua.weixiao.dao.LostinfoMapper;
import com.xihua.weixiao.entity.Topic;
import com.xihua.weixiao.query.LostInfoQuery;
import com.xihua.weixiao.service.LostinfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.utils.BeanPropertiesCopyUtils;
import com.xihua.weixiao.utils.FileUtils;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.LostinfoRequest;
import com.xihua.weixiao.vo.response.LostFoundTimeLine;
import com.xihua.weixiao.vo.response.LostinfoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
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
    @Resource
    private FileUtils fileUtils;
    @Resource
    private LostinfoMapper mapper;
    private static final Logger LOGGER = LoggerFactory.getLogger(LostinfoServiceImpl.class);

    // 添加失物招领
    @Override
    public int addLostinfo(LostinfoRequest lostinfo, MultipartFile[] files) {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        Lostinfo lostinfo1 = new Lostinfo();
        BeanPropertiesCopyUtils.copyProperties(lostinfo,lostinfo1);
        lostinfo1.setLostinfoNo(uuid);
        lostinfo1.setLostinfoStatus(1);
        lostinfo1.setLostinfoCreateTime(System.currentTimeMillis());
        String name = fileUtils.getUpUrl("lostinfo/",files);
        lostinfo1.setLostinfoImg(name);
        return mapper.insert(lostinfo1);
    }

    //删除失物招领
    @Override
    public int deleteLostinfo(IdRequest idRequest) {
        return mapper.deleteById(idRequest.getId());
    }

    //查询失物招领
    @Override
    public List<LostinfoResponse> queryLostinfo(IdRequest idRequest) {
        return mapper.queryLostinfo(idRequest);
    }

    @Override
    public List<LostFoundTimeLine> getDonationTimeLineByMyId(IdRequest idRequest) {
        return mapper.getDonationTimeLineByMyId(idRequest);
    }

    @Override
    public List<LostinfoResponse> selectLostinfo(LostInfoQuery query) {
        return mapper.selectLostinfo(query);
    }

    @Override
    public LostinfoResponse queryDetailLost(IdRequest idRequest) {
        return mapper.queryDetailLost(idRequest);
    }
}
