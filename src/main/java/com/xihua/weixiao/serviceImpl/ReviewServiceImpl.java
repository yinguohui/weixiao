package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Review;
import com.xihua.weixiao.dao.ReviewMapper;
import com.xihua.weixiao.service.ReviewService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
