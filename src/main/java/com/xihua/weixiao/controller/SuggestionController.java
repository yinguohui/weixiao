package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.Suggestion;
import com.xihua.weixiao.entity.Topic;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.SuggestionService;
import com.xihua.weixiao.serviceImpl.SuggestionServiceImpl;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestBody;
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


    @Autowired
    private SuggestionService service;
    private static final Logger LOGGER = LoggerFactory.getLogger(SuggestionController.class);
    /**
     * @Description : 查询自己的反馈
     * @Author: ygh
     * @Date: 2019/7/30 23:12
     */
    @RequestMapping("/querymyid")
    @ResponseBody
    public ApiResult getSuggestionByMyId(@RequestBody IdRequest request) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(service.getSuggestionByMyId(request));
            return apiResult;
        } catch (Exception e) {
            LOGGER.info("查询意见失败",e);
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
    public ApiResult addSuggestion(@RequestBody Suggestion suggestion, MultipartFile [] files) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(service.addSuggestion(suggestion,files));
            return apiResult;
        } catch (Exception e) {
            LOGGER.info("提交意见失败",e);
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
    public ApiResult deleteSuggestionById(@RequestBody IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(service.deleteById(idRequest.getId()));
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
    /**
     * @Description :
     * @Author: ygh
     * @Date: 2019/8/12 16:42
     */
    @RequestMapping("/quarytimesuggestion")
    @ResponseBody
    public ApiResult getSuggestionByTimeLine(@RequestBody IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(service.getSuggestionTimeLineByMyId(idRequest));
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description :
     * @Author: ygh
     * @Date: 2019/8/12 16:42
     */
    @RequestMapping("/querysuggestionbyid")
    @ResponseBody
    public ApiResult getSuggestionDetail(@RequestBody IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(service.getSuggestionDetail(idRequest));
            return apiResult;
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResult.failure("");
        }
    }
}

