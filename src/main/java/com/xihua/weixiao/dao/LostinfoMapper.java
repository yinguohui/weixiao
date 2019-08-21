package com.xihua.weixiao.dao;

import com.baomidou.mybatisplus.plugins.Page;
import com.xihua.weixiao.entity.Lostinfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xihua.weixiao.query.LostInfoQuery;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.LostFoundTimeLine;
import com.xihua.weixiao.vo.response.LostinfoResponse;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface LostinfoMapper extends BaseMapper<Lostinfo> {
    public List<LostinfoResponse> queryLostinfo(IdRequest idRequest);

    public List<LostFoundTimeLine> getDonationTimeLineByMyId(IdRequest idRequest);

    public List<LostinfoResponse> selectLostinfo(LostInfoQuery query);
    public LostinfoResponse queryDetailLost(IdRequest idRequest);
}
