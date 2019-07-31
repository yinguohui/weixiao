package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.Donation;
import com.xihua.weixiao.entity.Page;
import com.xihua.weixiao.entity.Topic;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.TopicService;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.TopicRequest;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping("/topic")
public class TopicController {

    @Resource
    private TopicService topicService;

    private static final Logger LOGGER = LoggerFactory.getLogger(TopicController.class);
    /**
     * @Description : 查询自己的话题
     * @Author: ygh
     * @Date: 2019/7/30 23:12
     */
    @RequestMapping("/getTopicByMe")
    @ResponseBody
    public ApiResult getTopicByMe(IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(topicService.getTopicByMe(idRequest));
            return apiResult;
        } catch (Exception e) {
            LOGGER.info("s",e);
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查询主提通过Id
     * @Author: ygh
     * @Date: 2019/7/30 23:14
     */
    @RequestMapping("/getTopicById")
    @ResponseBody
    public ApiResult getTopicById(IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(idRequest);
            return apiResult;
        } catch (Exception e) {
            LOGGER.info("",e);
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 发布主题
     * @Author: ygh
     * @Date: 2019/7/30 23:14
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addTopic(TopicRequest topicRequest, MultipartFile[] files, HttpServletRequest request) {
        try {

            ApiResult apiResult = ApiResult.success();
            String path = request.getContextPath()+"";
            topicService.addTopic(topicRequest,files,path);
            return apiResult;
        } catch (Exception e) {
            LOGGER.info("发布主题失败",e);
            return ApiResult.failure("发布主题失败");
        }
    }
    /**
     * @Description : 删除发布的主题
     * @Author: ygh
     * @Date: 2019/7/30 23:14
     */
    @RequestMapping("/deleteTopic")
    @ResponseBody
    public ApiResult deleteTopicById(IdRequest request) {
        try {
            ApiResult apiResult = ApiResult.success();
            topicService.deleteTopicById(request);
            return apiResult;
        } catch (Exception e) {
            LOGGER.info("删除主题失败",e);
            return ApiResult.failure("删除主题失败");
        }
    }
    /**
     * @Description : 查看所有主题
     * @Author: ygh
     * @Date: 2019/7/30 23:14
     */
    @RequestMapping("/quaryAllTopic")
    @ResponseBody
    public ApiResult queryTopicAll(Page page) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(topicService.queryTopicAll(page));
            return apiResult;
        } catch (Exception e) {
            LOGGER.info("",e);
            return ApiResult.failure("");
        }
    }
}

