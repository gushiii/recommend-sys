package com.gushiii.recommend.controller;

import com.gushiii.recommend.common.BusinessException;
import com.gushiii.recommend.common.CommonError;
import com.gushiii.recommend.common.CommonRes;
import com.gushiii.recommend.common.EmBusinessError;
import com.gushiii.recommend.model.UserModel;
import com.gushiii.recommend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : GUSHIII
 * @version : 1.0
 * @projectName : recommend-sys
 * @package : com.gushiii.recommend.controller
 * @className : UserController
 * @description : TODO
 * @date : 2023/10/13 10:09
 */
@Controller("/user")
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }

    @RequestMapping("/index")
    public ModelAndView index () {
        String userName = "gushiii";
        ModelAndView modelAndView = new ModelAndView("/index.html");
        modelAndView.addObject("name", userName);
        return modelAndView;
    }

    @RequestMapping("/get")
    @ResponseBody
    public CommonRes getUser(@RequestParam(name = "id") Integer id) throws BusinessException {
        UserModel userModel = userService.getUser(id);
        if (userModel == null) {
            throw new BusinessException(EmBusinessError.NO_OBJECT_FOUND);
        } else {
            return CommonRes.create(userModel);
        }
    }
}
