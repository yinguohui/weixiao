package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.Review;
import com.xihua.weixiao.entity.Suggestion;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.ReviewService;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.ReviewRequest;
import com.xihua.weixiao.vo.response.ReviewResponse;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/review")
public class ReviewController {
    @Resource
    private ReviewService reviewService;

    /**
     * @Description : 增加回复
     * @Author: ygh
     * @Date: 2019/7/31 22:00
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addReview(@RequestBody ReviewRequest request) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(reviewService.addReview(request));
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
    public ApiResult deleteReview(IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(reviewService.deleteById(idRequest.getId()));
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查询回复
     * @Author: ygh
     * @Date: 2019/7/31 22:00
     */
    @RequestMapping("/query")
    @ResponseBody
    public ApiResult queryReviewInComment(IdQueryRequest request) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查询回复
     * @Author: ygh
     * @Date: 2019/7/31 22:00
     */
    @RequestMapping("/querybytopicdd")
    @ResponseBody
    public ApiResult queryReviewInComment(@RequestBody IdRequest request) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(reviewService.queryByTopicId(request));
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    //getMineReview
    /**
     * @Description : 关于我的
     * @Author: ygh
     * @Date: 2019/7/31 22:00
     */
    @RequestMapping("/getinemreview")
    @ResponseBody
    public ApiResult getMineReview(@RequestBody IdRequest request) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(reviewService.getMineReview(request));
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
}

