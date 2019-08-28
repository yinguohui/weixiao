package com.xihua.weixiao.dao;

import com.xihua.weixiao.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xihua.weixiao.vo.request.LoginRequest;
import com.xihua.weixiao.vo.response.IdrResponse;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
@Component
public interface UserMapper extends BaseMapper<User> {

    public Integer addUser(User user);

    public Integer updatePassword(LoginRequest user);

    //查询电话号码重复
    public Integer repeatTel(String userTel);
    //通过电话号码茶人
    public User selectByTel(String userTel);
}
