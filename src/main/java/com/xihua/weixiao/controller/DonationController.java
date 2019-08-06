package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.Donation;
import com.xihua.weixiao.result.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
    /**
     * @Description : 捐赠物品
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addDonation(Donation donation, MultipartFile[] files, HttpServletRequest request) {
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
}

