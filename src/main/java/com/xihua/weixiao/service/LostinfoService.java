package com.xihua.weixiao.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.xihua.weixiao.entity.Lostinfo;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface LostinfoService extends IService<Lostinfo> {
    public int addLostinfo(Lostinfo lostinfo,MultipartFile[] files, String filepath);
    public int deleteLostinfo(IdRequest idRequest);
    public List<Lostinfo> queryLostinfo(IdQueryRequest idRequest);
}
