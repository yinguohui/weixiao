package com.xihua.weixiao.dao;

import com.xihua.weixiao.entity.LikeDetail;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.LikeDetailRequest;
import com.xihua.weixiao.vo.request.LostinfoRequest;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface LikeDetailMapper extends BaseMapper<LikeDetail> {
    public int deleteLikeDetail(LikeDetailRequest request);
    public int deleteLikeDetailByTopicId(IdRequest idRequest);
}
