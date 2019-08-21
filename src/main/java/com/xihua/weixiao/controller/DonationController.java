package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.Donation;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.DonationService;
import com.xihua.weixiao.vo.request.DonationRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
@Controller
@RequestMapping("/donation")
public class DonationController {

    @Resource
    private DonationService donationService;
    private static final Logger LOGGER = LoggerFactory.getLogger(DonationController.class);
    /**
     * @Description : 捐赠物品
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addDonation(DonationRequest request, MultipartFile[] files) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(donationService.addDonation(request,files));
            return apiResult;
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResult.failure("新增捐赠失败");
        }
    }
    /**
     * @Description : 查询自己捐赠的物品
     * @Author: ygh
     * @Date: 2019/7/30 23:12
     */
    @RequestMapping("/query")
    @ResponseBody
    public ApiResult getDonationByMe(Donation donation) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查询自己捐赠的物品
     * @Author: ygh
     * @Date: 2019/7/30 23:12
     */
    @RequestMapping("/quarytimedanotion")
    @ResponseBody
    public ApiResult getDonationTimeLine(@RequestBody IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(donationService.getDonationTimeLine(idRequest));
            return apiResult;
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查询单个捐赠的物品
     * @Author: ygh
     * @Date: 2019/7/30 23:12
     */
    @RequestMapping("/querybyid")
    @ResponseBody
    public ApiResult getDonationById(@RequestBody IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(donationService.selectById(idRequest.getId()));
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
    public ApiResult DeleteById(@RequestBody IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(donationService.deleteById(idRequest.getId()));
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    @RequestMapping("/queydetaildonation")
    @ResponseBody
    public ApiResult queyDetailDonation(@RequestBody IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(donationService.queyDetailDonation(idRequest));
            return apiResult;
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResult.failure("");
        }
    }
}

