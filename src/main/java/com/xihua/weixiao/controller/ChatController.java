package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.Chat;
import com.xihua.weixiao.query.ChatQuery;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.ChatService;
import com.xihua.weixiao.vo.request.ChatRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import org.apache.ibatis.session.RowBounds;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
@Controller
@RequestMapping("/chat")
public class ChatController {

    @Resource
    private ChatService service;
    /**
     * @Description : 增加一条聊天记录
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addChat(@RequestBody ChatRequest request) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(service.addChat(request));
            return apiResult;
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查询聊天记录
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/query")
    @ResponseBody
    public ApiResult queryChat(IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(service.selectChatNum(idRequest));
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查询聊天记录内容
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/querycontent")
    @ResponseBody
    public ApiResult queryChatContent(ChatQuery query) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(service.queryChatContent(query));
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 删除聊天记录
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ApiResult deleteChat(ChatQuery chatQuery) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(service.deleteByUserId(chatQuery));
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    //getAllChatById
    /**
     * @Description : 删除聊天记录
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/getallchatbyid")
    @ResponseBody
    public ApiResult getAllChatById(@RequestBody IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(service.getAllChatById(idRequest));
            return apiResult;
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResult.failure("");
        }
    }
    //getChatContent
    /**
     * @Description : 删除聊天记录
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/getchatcontent")
    @ResponseBody
    public ApiResult getChatContent(@RequestBody ChatQuery chatQuery) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(service.getChatContent(chatQuery));
            return apiResult;
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResult.failure("");
        }
    }

    //selectAllChatUser
    /**
     * @Description : 查询所有最近聊天的记录
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/selectallchatuser")
    @ResponseBody
    public ApiResult selectAllChatUser(@RequestBody IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(service.selectAllChatUser(idRequest));
            return apiResult;
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResult.failure("");
        }
    }
}

