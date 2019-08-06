package com.xihua.weixiao.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.xihua.weixiao.entity.Lostinfo;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.LostinfoService;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
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

    @Resource
    private LostinfoService lostinfoService;
    /**
     * @Description : 添加失物招领
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addLostinfo(Lostinfo lostinfo, MultipartFile[] files, HttpServletRequest request) {
        try {
            ApiResult apiResult = ApiResult.success();
            String bathpath = request.getContextPath();
            apiResult.setData(lostinfoService.addLostinfo(lostinfo,files,bathpath));
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
    public ApiResult deleteLostinfo(IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(lostinfoService.deleteLostinfo(idRequest));
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
    public ApiResult queryLostinfo(IdQueryRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(lostinfoService.queryLostinfo(idRequest));
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
}

