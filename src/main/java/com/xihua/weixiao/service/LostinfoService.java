package com.xihua.weixiao.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.xihua.weixiao.entity.Lostinfo;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.query.LostInfoQuery;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.LostinfoRequest;
import com.xihua.weixiao.vo.response.LostFoundTimeLine;
import com.xihua.weixiao.vo.response.LostinfoResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface LostinfoService extends IService<Lostinfo> {
    public int addLostinfo(LostinfoRequest lostinfo, MultipartFile[] files);
    public int deleteLostinfo(IdRequest idRequest);
    public List<LostinfoResponse> queryLostinfo(IdRequest idRequest);
    public List<LostFoundTimeLine> getDonationTimeLineByMyId(IdRequest idRequest);
    public List<LostinfoResponse> selectLostinfo(LostInfoQuery query);
    public LostinfoResponse queryDetailLost(IdRequest idRequest);
}
