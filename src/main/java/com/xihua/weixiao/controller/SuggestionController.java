package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.Suggestion;
import com.xihua.weixiao.entity.Topic;
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
@RequestMapping("/suggestion")
public class SuggestionController {
    /**
     * @Description : 查询自己的反馈
     * @Author: ygh
     * @Date: 2019/7/30 23:12
     */
    @RequestMapping("/querymyid")
    @ResponseBody
    public ApiResult getSuggestionByMyId(Suggestion topic) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 提交意见反馈
     * @Author: ygh
     * @Date: 2019/7/30 23:12
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addSuggestion(Suggestion topic, MultipartFile [] files, HttpServletRequest request) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查询意见
     * @Author: ygh
     * @Date: 2019/7/30 23:12
     */
    @RequestMapping("/queryid")
    @ResponseBody
    public ApiResult querySuggestionById(Suggestion topic) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 删除意见
     * @Author: ygh
     * @Date: 2019/7/30 23:12
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ApiResult deleteSuggestionById(Suggestion topic) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查看所有意见
     * @Author: ygh
     * @Date: 2019/7/30 23:12
     */
    @RequestMapping("/queryall")
    @ResponseBody
    public ApiResult queryAllSuggestion(Suggestion topic) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
}

