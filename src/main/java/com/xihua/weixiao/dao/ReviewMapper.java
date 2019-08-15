package com.xihua.weixiao.dao;

import com.xihua.weixiao.entity.Review;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.ReviewResponse;

import javax.persistence.Id;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface ReviewMapper extends BaseMapper<Review> {
   public List<ReviewResponse> queryReviewByTopicId(IdRequest idRequest);
   public int deleteReviewByTopicId(IdRequest idRequest);
    public List<ReviewResponse> queryByTopicId(IdRequest request);
}
