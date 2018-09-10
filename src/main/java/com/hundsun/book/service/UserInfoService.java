package com.hundsun.book.service;

import com.hundsun.book.model.UserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserInfoService {

    void AddBookUser(UserInfo userInfo);

    UserInfo delBookUserById(@Param("id") String id);

    UserInfo updateBookUserById(UserInfo userInfo);

    UserInfo getBookUserById(@Param("id") String id);

}
