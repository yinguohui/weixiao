package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.Goods;
import com.xihua.weixiao.dao.GoodsMapper;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.GoodsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.vo.request.GoodsRequestBean;
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

    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public int addGoods(GoodsRequestBean goods, MultipartFile[] create,String basepath) throws IOException {
        String uuid= UUID.randomUUID().toString().replaceAll("-","");
        Goods goods1 = new Goods();
        goods1.setGoodsNo(uuid);
        goods1.setGoodsCreateTime(System.currentTimeMillis());
        goods1.setGoodsUserNo("");
        goods1.setGoodsDesciption(goods.getGoodsDesciption());
        goods1.setGoodsPrice(goods.getGoodsPrice());
        goods1.setGoodsType(goods.getGoodsType());
        goods1.setGoodsPrice(goods.getGoodsPrice());
        goods1.setGoodsName(goods.getGoodsName());
        String name = "";
        //定义时间戳作为文件名的一部分吗，为了文件名不重复定义时间戳为文件名
        String tFileName = "goods/"+new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        File dir = new File(basepath, tFileName);
        if(!dir.exists()){
            dir.mkdirs();
        }
        // MultipartFile自带的解析方法
        for (MultipartFile multipartFile:create) {
            File file = new File(basepath + "/" + tFileName + "/" + uuid + ".png");
            multipartFile.transferTo(file);
            name = name + "http://192.168.43.240:8080/templates/images/" + tFileName + "/" + file.getName() + "*&";
        }
        if (!name.equals("")){
            name = name.substring(0,name.length()-1);
        }
        goods1.setGoodsImg(name);
        return goodsMapper.insert(goods1);
    }

    @Override
    public List<GoodsRequestBean> getGoods(RowBounds rowBounds) {
        return null;
    }

    @Override
    public GoodsResponseBean getGoodsDetailInfo(int goodsId) {
        return null;
    }
}
