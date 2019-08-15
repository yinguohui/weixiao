package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.Goods;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.query.GoodsQuery;
import com.xihua.weixiao.query.PageResult;
import com.xihua.weixiao.vo.request.GoodsRequest;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.GoodsResponse;
import com.xihua.weixiao.vo.response.GoodsResponseBean;
import com.xihua.weixiao.vo.response.GoodsTimeLine;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface GoodsService extends IService<Goods> {
    /**
     * @Description : 增加
     * @Author: ygh
     * @Date: 2019/7/30 20:16
     */
    public  int addGoods(GoodsRequest goods, MultipartFile[] files) throws IOException;
    
    /**
     * @Description : 按条件查询
     * @Author: ygh
     * @Date: 2019/7/30 20:19
     */
    public PageResult<GoodsResponse> getGoods(GoodsQuery goodsQuery);

    public GoodsResponseBean getGoodsDetailInfo(int goodsId);

    public List<GoodsResponse> queryGoodsByKey(String key);

    public List<GoodsTimeLine> getGoodsTimeLine(IdRequest idRequest);
}
