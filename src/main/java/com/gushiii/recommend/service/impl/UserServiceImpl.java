package com.gushiii.recommend.service.impl;

import com.gushiii.recommend.dal.UserModelMapper;
import com.gushiii.recommend.model.UserModel;
import com.gushiii.recommend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
