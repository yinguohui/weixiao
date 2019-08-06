package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.Review;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface ReviewService extends IService<Review> {
    public int addReview(Review review);
}
