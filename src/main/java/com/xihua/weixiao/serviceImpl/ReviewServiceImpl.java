package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Review;
import com.xihua.weixiao.dao.ReviewMapper;
import com.xihua.weixiao.service.ReviewService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.utils.BeanPropertiesCopyUtils;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.ReviewRequest;
import com.xihua.weixiao.vo.response.ReviewResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.Id;
import java.util.ArrayList;
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
public class ReviewServiceImpl extends ServiceImpl<ReviewMapper, Review> implements ReviewService {

    @Resource
    private ReviewMapper mapper;
    //增加评论
    @Override
    public int addReview(ReviewRequest reviewRequest) {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        Review review = new Review();
        BeanPropertiesCopyUtils.copyProperties(review,reviewRequest);
        review.setReviewCreateTime(System.currentTimeMillis());
        review.setReviewStatus(1);
        review.setReviewNo(uuid);
        return mapper.insert(review);
    }

    @Override
    public List<ReviewResponse> queryByTopicId(IdRequest request) {
        return mapper.queryByTopicId(request);
    }

    //删除评论
    public int deleteReview(IdRequest idRequest){
        return mapper.deleteById(idRequest.getId());
    }

    //查看同一主题所有评论
    public List<ReviewResponse> queryReviewByTopicId(IdRequest idRequest){
        List<ReviewResponse> reviews = mapper.queryReviewByTopicId(idRequest);
        return reviews;
    }

    //删除某主题下的评论
    private int deleteReviewByTopicId(IdRequest idRequest){
        return mapper.deleteReviewByTopicId(idRequest);
    }
}
