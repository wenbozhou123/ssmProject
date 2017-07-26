package com.springmvc.service.impl;

import com.springmvc.dao.UserMapper;
import com.springmvc.entity.User;
import com.springmvc.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhoubo on 7/26/2017.
 */

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userDao;

    public User selectUser(Integer userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
