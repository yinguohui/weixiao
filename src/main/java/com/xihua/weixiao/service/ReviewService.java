package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.Review;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.ReviewRequest;
import com.xihua.weixiao.vo.response.MineReviewResponse;
import com.xihua.weixiao.vo.response.ReviewResponse;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface ReviewService extends IService<Review> {
    public int addReview(ReviewRequest review);
    public List<ReviewResponse> queryByTopicId(IdRequest request);

    public List<MineReviewResponse>  getMineReview(IdRequest request);
}
