package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.User;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.UserService;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.LoginRequest;
import com.xihua.weixiao.vo.request.UserRequest;
import com.xihua.weixiao.vo.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
    @RequestMapping("/resetpassword")
    @ResponseBody
    public ApiResult updateUser(LoginRequest user){
        return userService.resetPassword(user);
    }
    @RequestMapping("/getuserinfobyid")
    @ResponseBody
    public ApiResult getUserInfoById(@RequestBody IdRequest idRequest){
        ApiResult apiResult = ApiResult.success();
        try {
            apiResult.setData(userService.getUserInfoById(idRequest));
        }catch (Exception e){
            e.printStackTrace();
            apiResult = ApiResult.failure("查询出错");
        }
        return apiResult;
    }
    @RequestMapping("/updateuserinfo")
    @ResponseBody
    public ApiResult updateUserInfo(UserRequest request){
        ApiResult apiResult = ApiResult.success();
        try {
            apiResult.setData(userService.updateUserInfo(request));
        }catch (Exception e){
            e.printStackTrace();
            apiResult = ApiResult.failure("更新失败");
        }
        return apiResult;
    }

}

