package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.User;
import com.xihua.weixiao.dao.UserMapper;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.utils.BeanPropertiesCopyUtils;
import com.xihua.weixiao.utils.FileUtils;
import com.xihua.weixiao.vo.request.*;
import com.xihua.weixiao.vo.response.IdrResponse;
import com.xihua.weixiao.vo.response.UserResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private UserMapper userMapper;
    @Resource
    private FileUtils fileUtils;
    //登陆

    @Override
    public ApiResult telLogin(LoginRequest request) {
        User user = userMapper.selectByTel(request.getUserTel());
        if (null==user){
            return ApiResult.failure("账号不存在");
        }
        if (user.getUserPassword().equals(request.getUserPassword())){
            UserResponse userResponse = new UserResponse();
            BeanPropertiesCopyUtils.copyProperties(user,userResponse);
            return ApiResult.success(userResponse);
        } else{
            return ApiResult.failure("密码错误");
        }

    }

    // 注册
    @Override
    public ApiResult telRegister(LoginRequest request ,MultipartFile [] files) {
        User user = new User();
        user.setUserNo(UUID.randomUUID().toString());
        user.setUserTel(request.getUserTel());
        user.setUserPassword(request.getUserPassword());
        String name = fileUtils.getUpUrl("idntify/",files);
        user.setUserAuthentication(name);
        Integer a = userMapper.repeatTel(request.getUserTel());
        if (userMapper.repeatTel(request.getUserTel())>0){
            logger.info("电话号码已存在，请选择重置密码"+user.toString());
           return ApiResult.failure("电话号码已存在，请选择重置密码");
        }
        if (userMapper.addUser(user)>0){
            logger.info("用户已建立"+user.toString());
            return ApiResult.success();
        }
        else{
            logger.info("创建用户失败"+user.toString());
            return ApiResult.failure("创建用户失败");
        }
    }

    // 忘记密码
    @Override
    public ApiResult resetPassword(LoginRequest user) {
        User newuser = userMapper.selectByTel(user.getUserTel());
        if (null==newuser){
            return ApiResult.failure("用户不存在");
        }
        if (userMapper.updatePassword(user)>0){
            return ApiResult.success();
        }
        return ApiResult.failure("更新失败");
    }

    // 修改个人信息
    @Override
    public int updateUserInfo(@RequestBody UserRequest user) {
        User user1 = new User();
        BeanPropertiesCopyUtils.copyProperties(user,user1);
       return userMapper.updateById(user1);
    }

    @Override
    public UserResponse getUserInfoById(IdRequest idRequest) {
        UserResponse response = new UserResponse();
        BeanPropertiesCopyUtils.copyProperties(userMapper.selectById(idRequest.getId()),response);
        return response;
    }

    @Override
    public int createTitle(String userid, MultipartFile create) {
        User user = new User();
        user.setUserId(Integer.parseInt(userid));
        String name = fileUtils.getUpUrl("head/",create);
        user.setUserImg(name);
        return userMapper.updateById(user);
    }

    @Override
    public int updateUserPassword(PasswordRequest passwordRequest) {
        User user = userMapper.selectById(passwordRequest.getUserId());
        if (user.getUserPassword().equals(passwordRequest.getOldPasswrod())){
            user.setUserPassword(passwordRequest.getNewPassword());
            return userMapper.updateById(user);
        }else {
            return -1;
        }
    }

}
