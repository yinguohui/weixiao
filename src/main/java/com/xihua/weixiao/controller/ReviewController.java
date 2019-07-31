package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.Review;
import com.xihua.weixiao.entity.Suggestion;
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
@RequestMapping("/review")
public class ReviewController {
    /**
     * @Description : 增加回复
     * @Author: ygh
     * @Date: 2019/7/31 22:00
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addReview(Review review) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 删除回复
     * @Author: ygh
     * @Date: 2019/7/31 22:00
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ApiResult deleteReview(Review review) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 删除回复
     * @Author: ygh
     * @Date: 2019/7/31 22:00
     */
    @RequestMapping("/query")
    @ResponseBody
    public ApiResult queryReviewInComment(Review review) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
}

