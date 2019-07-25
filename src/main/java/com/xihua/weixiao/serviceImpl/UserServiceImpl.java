package com.xihua.weixiao.serviceImpl;

import com.xihua.weixiao.entity.User;
import com.xihua.weixiao.dao.UserMapper;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xihua.weixiao.vo.request.LoginRequest;
import org.springframework.stereotype.Service;

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
    @Resource
    private UserMapper userMapper;

    @Override
    public ApiResult telLogin(LoginRequest request) {
        if (userMapper.addUser(new User())>0){
          return ApiResult.success();
        }
        else{
            return ApiResult.failure("创建用户失败");
        }

    }

    @Override
    public ApiResult telRegister(LoginRequest request) {
        User user = new User();
        user.setUserNo(UUID.randomUUID().toString());
        user.setUserTel(request.getUserTel());
        user.setUserPassword(request.getUserPassword());
        if (userMapper.addUser(user)>0){
            return ApiResult.success();
        }
        else{
            return ApiResult.failure("创建用户失败");
        }
    }

    @Override
    public ApiResult resetPassword(LoginRequest request) {
        return null;
    }
}
