package com.xihua.weixiao.controller;


import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.GoodsService;
import com.xihua.weixiao.vo.request.GoodsRequestBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
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
    public ApiResult addSellGoods(GoodsRequestBean bean, MultipartFile[] create, HttpServletRequest request){
        try {
            ApiResult apiResult = ApiResult.success();
            String basePath = request.getServletContext().getRealPath("templates/images/");
            apiResult.setData(goodsService.addGoods(bean,create,basePath));
            return apiResult;
        }catch (Exception e){
            LOGGER.info("出售物品失败",e);
            return ApiResult.failure("出售物品失败");
        }
    }
}

