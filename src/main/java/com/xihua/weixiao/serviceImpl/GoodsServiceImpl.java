package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Goods;
import com.xihua.weixiao.dao.GoodsMapper;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.GoodsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.utils.FileUtils;
import com.xihua.weixiao.vo.request.GoodsRequestBean;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.response.GoodsResponse;
import com.xihua.weixiao.vo.response.GoodsResponseBean;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {
    @Autowired
    private FileUtils fileUtils;
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public int addGoods(GoodsRequestBean goods, MultipartFile[] files) throws IOException {
        String uuid= UUID.randomUUID().toString().replaceAll("-","");
        Goods goods1 = new Goods();
        goods1.setGoodsNo(uuid);
        goods1.setGoodsCreateTime(System.currentTimeMillis());
        goods1.setGoodsUserNo(goods.getGoodsUserNo());
        goods1.setGoodsDesciption(goods.getGoodsDesciption());
        goods1.setGoodsPrice(goods.getGoodsPrice());
        goods1.setGoodsType(goods.getGoodsType());
        goods1.setGoodsPrice(goods.getGoodsPrice());
        goods1.setGoodsName(goods.getGoodsName());
        String name = fileUtils.getUpUrl("goods",files);
        goods1.setGoodsImg(name);
        return goodsMapper.insert(goods1);
    }

    @Override
    public List<GoodsResponse> getGoods(IdQueryRequest idQueryRequest) {
        System.out.println(goodsMapper.getGoods(idQueryRequest));
        return goodsMapper.getGoods(idQueryRequest);
    }



    @Override
    public GoodsResponseBean getGoodsDetailInfo(int goodsId) {
        return null;
    }
}
