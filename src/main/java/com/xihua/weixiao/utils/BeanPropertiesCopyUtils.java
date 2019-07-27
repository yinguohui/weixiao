package com.xihua.weixiao.utils;


import org.springframework.beans.BeanUtils;

/**
 * @author ：ganjie
 * @description：实体类属性copy工具，返回目的类
 * @date ：Created in 2019-07-21 22:04
 * @modified By：
 */
public class BeanPropertiesCopyUtils {
    public static <T> T copyProperties(Object res,T des){
        BeanUtils.copyProperties(res,des);
        return des;
    }

}
