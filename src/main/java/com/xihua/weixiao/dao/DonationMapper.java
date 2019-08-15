package com.xihua.weixiao.dao;

import com.xihua.weixiao.entity.Donation;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.DonationResponse;
import com.xihua.weixiao.vo.response.DonationTimeLine;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface DonationMapper extends BaseMapper<Donation> {
    public List<DonationResponse> queryDonationByUserId(IdRequest idRequest);

    public List<DonationTimeLine> getDonationTimeLine(IdRequest idRequest);
}
