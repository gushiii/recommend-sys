package com.gushiii.recommend.request;

import javax.validation.constraints.NotBlank;

/**
 * @author : GUSHIII
 * @version : 1.0
 * @projectName : recommend-sys
 * @package : com.gushiii.recommend.request
 * @className : LoginReq
 * @description : TODO
 * @date : 2023/10/14 13:32
 */
public class LoginReq {
    @NotBlank(message = "手机号不能为空")
    private String telphone;
    @NotBlank(message = "密码不能为空")
    private String password;

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
