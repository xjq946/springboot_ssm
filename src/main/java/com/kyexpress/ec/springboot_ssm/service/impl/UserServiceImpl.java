package com.kyexpress.ec.springboot_ssm.service.impl;

import com.kyexpress.ec.springboot_ssm.dao.mapper.UserMapper;
import com.kyexpress.ec.springboot_ssm.pojo.User;
import com.kyexpress.ec.springboot_ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;
import java.util.List;

/**
 * Copyright (c) 2019 KYE Company
 * 跨越速运集团有限公司版权所有
 *
 * @author xiejiqing
 * @create 2019/4/13 11:41
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void deleteById(int id) {
        userMapper.deleteById(id);
    }

    @Override
    public void deleteByIds(List<Integer> ids) {
        userMapper.deleteByIds(ids);
    }
}
