package com.gushiii.recommend.service.impl;

import com.gushiii.recommend.common.BusinessException;
import com.gushiii.recommend.common.EmBusinessError;
import com.gushiii.recommend.dal.UserModelMapper;
import com.gushiii.recommend.model.UserModel;
import com.gushiii.recommend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * @author : GUSHIII
 * @version : 1.0
 * @projectName : recommend-sys
 * @package : com.gushiii.recommend.service.impl
 * @className : UserServiceImpl
 * @description : TODO
 * @date : 2023/10/13 10:27
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserModelMapper userModelMapper;

    @Override
    public UserModel getUser(Integer id) {
        return userModelMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public UserModel register(UserModel registerUser) throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException {
        registerUser.setPassword(encodeByMD5(registerUser.getPassword()));
        registerUser.setCreatedAt(new Date());
        registerUser.setUpdatedAt(new Date());
        try {
            userModelMapper.insertSelective(registerUser);
        } catch (DuplicateKeyException exception) {
            throw new BusinessException(EmBusinessError.REGISTER_DUP_FAIL);
        }

        return getUser(registerUser.getId());
    }

    @Override
    public UserModel login(String telphone, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException, BusinessException {
        UserModel userModel = userModelMapper.selectByTelphoneAndPassword(telphone, encodeByMD5(password));
        if (userModel == null) {
            throw new BusinessException(EmBusinessError.LOGIN_FAIL);
        }
        System.out.println("====================================");
        System.out.println(userModel.toString());
        System.out.println("====================================");
        return userModel;
    }

    private String encodeByMD5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(md5.digest(str.getBytes("utf-8")));
    }

}
