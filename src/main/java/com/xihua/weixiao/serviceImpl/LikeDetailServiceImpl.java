package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.LikeDetail;
import com.xihua.weixiao.dao.LikeDetailMapper;
import com.xihua.weixiao.service.LikeDetailService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.utils.BeanPropertiesCopyUtils;
import com.xihua.weixiao.vo.request.LikeDetailRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
public class LikeDetailServiceImpl extends ServiceImpl<LikeDetailMapper, LikeDetail> implements LikeDetailService {
    @Resource
    private LikeDetailMapper mapper;

    // 喜欢
    public int addLikeDetail(LikeDetailRequest request){
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        LikeDetail likeDetail = new LikeDetail();
        BeanPropertiesCopyUtils.copyProperties(likeDetail,request);
        likeDetail.setLikedetailNo(uuid);
        likeDetail.setLikedetailCreateTime(System.currentTimeMillis());
        likeDetail.setLikedetailStatus(1);
        return mapper.insert(likeDetail);
    }
    // 取消点赞
    private int deleteLikeDetail(LikeDetailRequest request){
        return mapper.deleteLikeDetail(request);
    }
}
