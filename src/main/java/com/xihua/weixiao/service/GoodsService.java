package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.Goods;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.vo.request.GoodsRequestBean;
import com.xihua.weixiao.vo.response.GoodsResponseBean;
import org.apache.ibatis.session.RowBounds;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

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
    public  int addGoods(GoodsRequestBean goods, MultipartFile[] create,String basepath) throws IOException;
    
    /**
     * @Description : 按条件查询
     * @Author: ygh
     * @Date: 2019/7/30 20:19
     */
    public List<GoodsRequestBean> getGoods(RowBounds rowBounds);

    public GoodsResponseBean getGoodsDetailInfo(int goodsId);
}
