package com.springmvc.service;

import com.springmvc.entity.User;

/**
 * Created by zhoubo on 7/26/2017.
 */
public interface IUserService {
    public User selectUser(Integer userId);
}
