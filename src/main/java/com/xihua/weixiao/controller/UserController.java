package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.User;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.UserService;
import com.xihua.weixiao.vo.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public ApiResult login(LoginRequest loginRequest){
        return userService.telLogin(loginRequest);
    }
    @RequestMapping("/register")
    @ResponseBody
    public ApiResult register(LoginRequest loginRequest){
        return userService.telRegister(loginRequest);
    }
    @RequestMapping("/update")
    @ResponseBody
    public ApiResult updateUser(User user){
        return userService.resetPassword(user);
    }

}

