package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Donation;
import com.xihua.weixiao.dao.DonationMapper;
import com.xihua.weixiao.entity.Suggestion;
import com.xihua.weixiao.service.DonationService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.utils.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
@Service
public class DonationServiceImpl extends ServiceImpl<DonationMapper, Donation> implements DonationService {
    @Resource
    private DonationMapper mapper;

    //捐赠
    public int addDonation(Donation donation, MultipartFile[] files) {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        Donation donation1 = new Donation();
        donation1.setDonationCreateTime(System.currentTimeMillis());
        donation1.setDonationUserId(donation.getDonationUserId());
        donation1.setDonationNo(uuid);
        donation1.setDoantionDescrption(donation.getDoantionDescrption());
        donation1.setDoantionStatus(1);
        return mapper.insert(donation1);
    }
}
