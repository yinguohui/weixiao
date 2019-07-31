package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.Chat;
import com.xihua.weixiao.entity.CommentDetail;
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
@RequestMapping("/commentDetail")
public class CommentDetailController {
    /**
     * @Description : 增加一条聊天记录
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addCommentDetail(CommentDetail commentDetail) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查询一条聊天记录
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/query")
    @ResponseBody
    public ApiResult queryCommentDetail(String id) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 删除一条聊天记录
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ApiResult deleteCommentDetail(String id) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
}

