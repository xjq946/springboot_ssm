package com.kyexpress.ec.springboot_ssm.service;

import com.kyexpress.ec.springboot_ssm.pojo.User;

import java.util.List;

/**
 * Copyright (c) 2019 KYE Company
 * 跨越速运集团有限公司版权所有
 *
 * @author xiejiqing
 * @create 2019/4/13 11:41
 */
public interface UserService {

    /**
     * 查询所有用户
     * @return List<User>
     */
    List<User> listUser();

    /**
     * 根据id查询用户
     * @param id
     * @return User
     */
    User getUserById(int id);

    /**
     * 添加一个用户
     * @param user
     */
    void addUser(User user);

    /**
     * 更新用户信息
     * @param user
     */
    void update(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    void deleteById(int id);

    /**
     *批量删除用户
     * @param ids
     */
    void deleteByIds(List<Integer> ids);
}
