package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.Chat;
import com.xihua.weixiao.entity.Place;
import com.xihua.weixiao.result.ApiResult;
import org.apache.ibatis.session.RowBounds;
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
@RequestMapping("/place")
public class PlaceController {
    /**
     * @Description : 增加地点
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addPlace(Place place) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 查询聊天记录
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/update")
    @ResponseBody
    public ApiResult updatePlace(String id) {
        try {
            ApiResult apiResult = ApiResult.success();
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
    public ApiResult deletePlace(String id) {
        try {
            ApiResult apiResult = ApiResult.success();
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
    @RequestMapping("/query")
    @ResponseBody
    public ApiResult queryPlace(String id) {
        try {
            ApiResult apiResult = ApiResult.success();
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
}

