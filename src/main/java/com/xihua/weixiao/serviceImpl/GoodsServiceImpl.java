package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Goods;
import com.xihua.weixiao.dao.GoodsMapper;
import com.xihua.weixiao.query.GoodsQuery;
import com.xihua.weixiao.query.PageResult;
import com.xihua.weixiao.service.GoodsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.utils.BeanPropertiesCopyUtils;
import com.xihua.weixiao.utils.FileUtils;
import com.xihua.weixiao.vo.request.GoodsRequest;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.GoodsDetailResponse;
import com.xihua.weixiao.vo.response.GoodsResponse;
import com.xihua.weixiao.vo.response.GoodsResponseBean;
import com.xihua.weixiao.vo.response.GoodsTimeLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
import java.util.Map;
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
    public int addGoods(GoodsRequest goods, MultipartFile[] files) throws IOException {
        String uuid= UUID.randomUUID().toString().replaceAll("-","");
        Goods goods1 = new Goods();
        BeanPropertiesCopyUtils.copyProperties(goods,goods1);
        goods1.setGoodsNo(uuid);
        goods1.setGoodsCreateTime(System.currentTimeMillis());
        String name = fileUtils.getUpUrl("goods/",files);
        goods1.setGoodsImg(name);
        return goodsMapper.insert(goods1);
    }

    @Override
    public PageResult<GoodsResponse> getGoods(GoodsQuery goodsQuery) {
        PageResult pageResult = new PageResult();
        pageResult.setCurrentPage(goodsQuery.getCurrentPage());
        pageResult.setPageSize(goodsQuery.getPageSize());
        goodsQuery.setPageOffset((goodsQuery.getCurrentPage()-1)*goodsQuery.getPageSize());
        pageResult.setItems(goodsMapper.getGoods(goodsQuery));
        return pageResult;
    }



    @Override
    public GoodsResponseBean getGoodsDetailInfo(int goodsId) {
        return null;
    }

    @Override
    public List<GoodsResponse> queryGoodsByKey(String key) {
        key = "%"+key+"%";
        List<GoodsResponse> list = goodsMapper.selectByKsy(key);
        return list;
    }

    @Override
    public List<GoodsTimeLine> getGoodsTimeLine(IdRequest idRequest) {
        return goodsMapper.getGoodsTimeLine(idRequest);
    }

    @Override
    public GoodsDetailResponse queryDetailById(IdRequest idRequest) {
        return goodsMapper.queryDetailById(idRequest);
    }
}
