package com.hundsun.book.mapper;

import com.hundsun.book.model.UserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserInfoMapper {

    @Insert({"insert into user_info(id, name, passwd, phone, email, money, empirical_value) values(#{id}, #{name}, #{passwd}, #{phone}, #{email}, #{money}, #{empiricalValue})"})
    void AddBookUser(UserInfo userInfo);

    @Delete("delect from user_info where id=#{id}")
    UserInfo delBookUserById(@Param("id") String id);

    UserInfo updateBookUserById(UserInfo userInfo);

    @Select("select * from user_info where id = #{id}")
    UserInfo getBookUserById(@Param("id") String id);
}
