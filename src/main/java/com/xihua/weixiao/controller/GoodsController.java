package com.xihua.weixiao.controller;


import com.xihua.weixiao.query.GoodsQuery;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.GoodsService;
import com.xihua.weixiao.vo.request.GoodsRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
    public ApiResult addSellGoods(GoodsRequest bean, MultipartFile[] files){
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
    @RequestMapping(value = "/queryAll")
    @ResponseBody
    public ApiResult querySellGoods(@RequestBody GoodsQuery query){
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(goodsService.getGoods(query));
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
    @RequestMapping(value = "/queryByKey")
    @ResponseBody
    public ApiResult querySellGoods(String key){
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(goodsService.queryGoodsByKey(key));
            return apiResult;
        }catch (Exception e){
            LOGGER.info("出售物品失败",e);
            return ApiResult.failure("出售物品失败");
        }
    }
    /**
     * @Description : 查询自己捐赠的物品
     * @Author: ygh
     * @Date: 2019/7/30 23:12
     */
    @RequestMapping("/quarytimegoods")
    @ResponseBody
    public ApiResult getGoodsTimeLine(@RequestBody IdRequest idRequest) {
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(goodsService.getGoodsTimeLine(idRequest));
            return apiResult;
        } catch (Exception e) {
            return ApiResult.failure("");
        }
    }
    /**
     * @Description : 学生出售物品
     * @Author: ygh
     * @Date: 2019/7/30 21:49
     */
    @RequestMapping(value = "/querydetailbyid")
    @ResponseBody
    public ApiResult queryDetailById(@RequestBody IdRequest idRequest){
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(goodsService.queryDetailById(idRequest));
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
    @RequestMapping("/delete")
    @ResponseBody
    public ApiResult delete(@RequestBody IdRequest idRequest){
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(goodsService.deleteById(idRequest.getId()));
            return apiResult;
        }catch (Exception e){
            LOGGER.info("出售物品失败",e);
            return ApiResult.failure("出售物品失败");
        }
    }
}

