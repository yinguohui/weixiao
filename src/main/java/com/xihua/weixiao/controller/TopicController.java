package com.xihua.weixiao.controller;

import com.xihua.weixiao.query.TopicQuery;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.TopicService;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.TopicRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public ApiResult getTopicByMe(@RequestBody IdRequest idRequest) {
        ApiResult apiResult = ApiResult.success();
        try {
            apiResult.setData(topicService.getTopicByMe(idRequest));
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
            apiResult =  ApiResult.failure("");
        }
        return apiResult;
    }

    /**
     * @Description : 查询主提通过Id
     * @Author: ygh
     * @Date: 2019/7/30 23:14
     */
    @RequestMapping("/getTopicById")
    @ResponseBody
    public ApiResult getTopicById(@RequestBody IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(topicService.getTopicById(idRequest));
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
    public ApiResult addTopic(TopicRequest topicRequest, MultipartFile[] files) {
        ApiResult apiResult = ApiResult.success();
        try {
            topicService.addTopic(topicRequest,files);
        } catch (Exception e) {
            LOGGER.info("发布主题失败",e);
            apiResult =  ApiResult.failure("发布主题失败");
        }
        return apiResult;
    }

    /**
     * @Description : 删除发布的主题
     * @Author: ygh
     * @Date: 2019/7/30 23:14
     */

    @RequestMapping("/deleteTopic")
    @ResponseBody
    public ApiResult deleteTopicById(@RequestBody IdRequest request) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(topicService.deleteTopicById(request));
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
    public ApiResult queryTopicAll() {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(topicService.queryTopicAll());
            return apiResult;
        } catch (Exception e) {
            LOGGER.info("",e);
            return ApiResult.failure("");
        }
    }

    /**
     * @Description : 查看我的发布主题时间线
     * @Author: ygh
     * @Date: 2019/7/30 23:14
     */
    @RequestMapping("/quaryTimeTopic")
    @ResponseBody
    public ApiResult quaryTimeTopic(@RequestBody  IdRequest query) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(topicService.quaryTimeTopic(query));
            return apiResult;
        } catch (Exception e) {
            LOGGER.info("",e);
            return ApiResult.failure("");
        }
    }
}

