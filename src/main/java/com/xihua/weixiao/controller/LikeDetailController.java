package com.xihua.weixiao.controller;


import com.xihua.weixiao.dao.LikeDetailMapper;
import com.xihua.weixiao.entity.Chat;
import com.xihua.weixiao.entity.LikeDetail;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.LikeDetailService;
import com.xihua.weixiao.utils.BeanPropertiesCopyUtils;
import com.xihua.weixiao.vo.request.LikeDetailRequest;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.UUID;

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
    @Resource
    private LikeDetailService service;

    /**
     * @Description : 增加点赞
     * @Author: ygh
     * @Date: 2019/7/30 23:01
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addLikeDetail(LikeDetailRequest likeDetailRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            LikeDetail likeDetail = new LikeDetail();
            BeanPropertiesCopyUtils.copyProperties(likeDetail,likeDetailRequest);
            likeDetail.setLikedetailNo(uuid);
            likeDetail.setLikedetailStatus(1);
            likeDetail.setLikedetailCreateTime(System.currentTimeMillis());
            service.insert(likeDetail);
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

