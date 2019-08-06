package com.xihua.weixiao.dao;

import com.xihua.weixiao.entity.Goods;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.response.GoodsResponse;
import com.xihua.weixiao.vo.response.GoodsResponseBean;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface GoodsMapper extends BaseMapper<Goods> {
   public List<GoodsResponse> getGoods(IdQueryRequest idQueryRequest);
}
