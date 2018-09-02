package com.hundsun.book.mapper;

import com.hundsun.book.model.LoveBookDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LoveBookDetailMapper {

    @Select("select * from love_book_detail a where a.user_id=#{userId}")
    List<LoveBookDetail> getByUserId(@Param("userId") String userId);

    @Insert({"insert into love_book_detail(user_id, book_no, create_time, status) values(#{userId}, #{bookNo}, #{createTime}, #{status})"})
    void add(LoveBookDetail loveBookDetail);

    @Delete("delect from love_book_detail where no=#{no}")
    void delete(@Param("no") Integer no);
}
