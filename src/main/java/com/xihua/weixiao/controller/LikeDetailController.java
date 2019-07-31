package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.Chat;
import com.xihua.weixiao.entity.LikeDetail;
import com.xihua.weixiao.result.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
@Controller
@RequestMapping("/likeDetail")
public class LikeDetailController {
    /**
     * @Description : 增加点赞
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addLikeDetail(LikeDetail likeDetail) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 去消点赞
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ApiResult deleteLikeDetail(String id) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查看点赞
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/query")
    @ResponseBody
    public ApiResult queryLikeDetail(String id) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
}

