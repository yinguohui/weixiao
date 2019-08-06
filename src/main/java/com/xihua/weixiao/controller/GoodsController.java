package com.xihua.weixiao.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.GoodsService;
import com.xihua.weixiao.vo.request.GoodsRequestBean;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;
    private static final Logger LOGGER = LoggerFactory.getLogger(GoodsController.class);
    /**
     * @Description : 学生出售物品
     * @Author: ygh
     * @Date: 2019/7/30 21:49
     */
    @RequestMapping("/add")
    @ResponseBody
    public ApiResult addSellGoods(GoodsRequestBean bean, MultipartFile[] files){
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(goodsService.addGoods(bean,files));
            return apiResult;
        }catch (Exception e){
            LOGGER.info("出售物品失败",e);
            return ApiResult.failure("出售物品失败");
        }
    }
    /**
     * @Description : 学生出售物品
     * @Author: ygh
     * @Date: 2019/7/30 21:49
     */
    @RequestMapping("/queryAll")
    @ResponseBody
    public ApiResult querySellGoods(IdQueryRequest idQueryRequest){
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(goodsService.getGoods(idQueryRequest));
            return apiResult;
        }catch (Exception e){
            LOGGER.info("出售物品失败",e);
            return ApiResult.failure("出售物品失败");
        }
    }
}

