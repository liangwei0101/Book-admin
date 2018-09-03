package com.hundsun.book.service.impl;

import com.hundsun.book.mapper.UserInfoMapper;
import com.hundsun.book.model.UserInfo;
import com.hundsun.book.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void AddBookUser(UserInfo userInfo) {
        userInfoMapper.AddBookUser(userInfo);
    }

    @Override
    public UserInfo delBookUserById(String id) {
        return userInfoMapper.delBookUserById(id);
    }

    @Override
    public UserInfo updateBookUserById(UserInfo userInfo) {
        return userInfoMapper.updateBookUserById(userInfo);
    }

    @Override
    public UserInfo getBookUserById(String id) {
        return userInfoMapper.getBookUserById(id);
    }
}
