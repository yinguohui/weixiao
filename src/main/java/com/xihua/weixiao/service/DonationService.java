package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.Donation;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.vo.request.DonationRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.DonationDetailResponse;
import com.xihua.weixiao.vo.response.DonationTimeLine;
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
public interface DonationService extends IService<Donation> {
        public int addDonation(DonationRequest request, MultipartFile[] files);
        public List<DonationTimeLine> getDonationTimeLine(IdRequest idRequest);

    public DonationDetailResponse queyDetailDonation(IdRequest idRequest);
}
