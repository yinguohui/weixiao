package com.xihua.weixiao.dao;

import com.xihua.weixiao.entity.CommentDetail;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xihua.weixiao.vo.request.IdRequest;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface CommentDetailMapper extends BaseMapper<CommentDetail> {
    public int deleteCommentDetailByTopicId(IdRequest idRequest);
}
