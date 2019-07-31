package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.User;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.vo.request.LoginRequest;
import com.xihua.weixiao.vo.response.IdrResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface UserService extends IService<User> {
    //login
    public ApiResult telLogin(LoginRequest request);
    //注册
    public ApiResult telRegister(LoginRequest request);
    //重置密码
    public ApiResult resetPassword(User user);
}
