package com.xihua.weixiao.controller;


import com.xihua.weixiao.entity.User;
import com.xihua.weixiao.result.ApiResult;
import com.xihua.weixiao.service.UserService;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.request.LoginRequest;
import com.xihua.weixiao.vo.request.PasswordRequest;
import com.xihua.weixiao.vo.request.UserRequest;
import com.xihua.weixiao.vo.response.UserResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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

    private static Logger looger = LoggerFactory.getLogger("UserController");

    @Autowired
    private UserService userService;
    // 登录
    @RequestMapping("/login")
    @ResponseBody
    public ApiResult login(LoginRequest loginRequest ){
        return userService.telLogin(loginRequest);
    }
    // 注册
    @RequestMapping("/register")
    @ResponseBody
    public ApiResult register(LoginRequest loginRequest,MultipartFile []files){
        return userService.telRegister(loginRequest,files);
    }
    //重置密码
    @RequestMapping("/resetpassword")
    @ResponseBody
    public ApiResult updateUser(LoginRequest user){
        return userService.resetPassword(user);
    }

    //修改密码
    @RequestMapping("/updatepassword")
    @ResponseBody
    public ApiResult updateUserPassword(@RequestBody PasswordRequest passwordRequest){
        try {
            ApiResult apiResult = ApiResult.success();
            apiResult.setData(userService.updateUserPassword(passwordRequest));
            return apiResult;
        }catch (Exception e){
            looger.error(e.getMessage());
            return ApiResult.failure("注册失败");
        }

    }

    // 通过Id得到用户信息
    @RequestMapping("/getuserinfobyid")
    @ResponseBody
    public ApiResult getUserInfoById(@RequestBody IdRequest idRequest){
        ApiResult apiResult = ApiResult.success();
        try {
            apiResult.setData(userService.getUserInfoById(idRequest));
        }catch (Exception e){
            looger.error(e.getMessage());
            apiResult = ApiResult.failure("查询出错");
        }
        return apiResult;
    }
    @RequestMapping("/updateuserinfo")
    @ResponseBody
    public ApiResult updateUserInfo(@RequestBody UserRequest request){
        ApiResult apiResult = ApiResult.success();
        try {
            apiResult.setData(userService.updateUserInfo(request));
        }catch (Exception e){
            looger.error(e.getMessage());
            apiResult = ApiResult.failure("更新失败");
        }
        return apiResult;
    }
    //头像上传
    @RequestMapping(value="/headimg")
    @ResponseBody
    public ApiResult createTitle(MultipartFile create,String userid) {
        ApiResult apiResult = ApiResult.success();
        try {
            apiResult.setData(userService.createTitle(userid,create));
        }catch (Exception e){
            e.printStackTrace();
            apiResult = ApiResult.failure("更新失败");
        }
        return apiResult;
    }

}

