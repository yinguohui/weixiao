package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.Donation;
import com.xihua.weixiao.entity.Lostinfo;
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
@RequestMapping("/lostinfo")
public class LostinfoController {
    /**
     * @Description : 添加失物招领
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addLostinfo(Lostinfo donation, MultipartFile[] files, HttpServletRequest request) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 删除失物招领
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ApiResult deleteLostinfo(String id) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查询失物招领
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/query")
    @ResponseBody
    public ApiResult queryLostinfo(String id) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
}

