package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.User;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.LoginRequest;
import com.xihua.weixiao.vo.request.PasswordRequest;
import com.xihua.weixiao.vo.request.UserRequest;
import com.xihua.weixiao.vo.response.IdrResponse;
import com.xihua.weixiao.vo.response.UserResponse;
import org.springframework.web.multipart.MultipartFile;

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
    public ApiResult telRegister(LoginRequest request,MultipartFile [] files);
    //重置密码
    public ApiResult resetPassword(LoginRequest user);
    //修改用户个人信息
    public int updateUserInfo(UserRequest user);

    public UserResponse getUserInfoById(IdRequest idRequest);

    public int createTitle(String userid, MultipartFile create);

    public int updateUserPassword(PasswordRequest passwordRequest);
}
