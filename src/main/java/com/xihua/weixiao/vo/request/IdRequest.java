package com.xihua.weixiao.vo.request;

import com.baomidou.mybatisplus.plugins.Page;

/**
 * @ClassName IdRequest
 * @Author ygh
 * @DATE 2019/7/31 22:09
 **/
public class IdRequest{

    private Integer id;

    private String no;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
