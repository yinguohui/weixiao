package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Donation;
import com.xihua.weixiao.dao.DonationMapper;
import com.xihua.weixiao.entity.Suggestion;
import com.xihua.weixiao.service.DonationService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.utils.BeanPropertiesCopyUtils;
import com.xihua.weixiao.utils.FileUtils;
import com.xihua.weixiao.vo.request.DonationRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.DonationResponse;
import com.xihua.weixiao.vo.response.DonationTimeLine;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.persistence.Id;
import java.util.List;
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
    @Resource
    private FileUtils fileUtils;

    // 查看捐赠
    public List<DonationResponse> queryDonationByUserId(IdRequest request) {
        return mapper.queryDonationByUserId(request);
    }

    @Override
    public int addDonation(DonationRequest request, MultipartFile[] files) {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        Donation donation1 = new Donation();
        BeanPropertiesCopyUtils.copyProperties(request,donation1);
        donation1.setDonationCreateTime(System.currentTimeMillis());
        donation1.setDonationNo(uuid);
        donation1.setDoantionStatus(1);
        String name = fileUtils.getUpUrl("donation/",files);
        return mapper.insert(donation1);
    }

    @Override
    public List<DonationTimeLine> getDonationTimeLine(IdRequest idRequest) {
        return mapper.getDonationTimeLine(idRequest);
    }
}
