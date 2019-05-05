package com.kyexpress.ec.springboot_ssm.controller;

import com.kyexpress.ec.springboot_ssm.pojo.User;
import com.kyexpress.ec.springboot_ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Copyright (c) 2019 KYE Company
 * 跨越速运集团有限公司版权所有
 *
 * @author xiejiqing
 * @create 2019/4/13 11:41
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/list")
    public List<User> listUser(){
        return userService.listUser();
    }

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping("/add")
    public String addUser(User user){
        userService.addUser(user);
        return "insert success!";
    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    @RequestMapping("/update")
    public String update(User user){
        userService.update(user);
        return "update success!";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id){
        userService.deleteById(id);
        return "delete success!";
    }

    //批量删除用户
    @RequestMapping("/deleteByIds")
    public String deleteByIds(@RequestBody List<Integer> ids){
        userService.deleteByIds(ids);
        return "delete success";
    }
}
