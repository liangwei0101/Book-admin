package com.hundsun.book.mapper;

import com.hundsun.book.model.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 图书服务接口
 */
public interface BookMapper {

    @Select("select * from book_info where id = #{id}")
    @Results({@Result(property="bookCommentList",column="no",javaType=List.class,
            many=@Many(select="com.hundsun.book.mapper.BookOperationMapper.getBookCommentByNo"))
    })
    Book getBookById(@Param("id") String id);


    @Select("select * from book_info where no = #{no}")
    @Results({@Result(property = "no", column = "no"),
              @Result(property="bookCommentList",column="no",javaType=List.class,
                many=@Many(select="com.hundsun.book.mapper.BookOperationMapper.getBookCommentByNo"))
    })
    List<Book> getBookByNo(@Param("no") Integer no);


    @Select("select * from book_info")
    @Results({@Result(property = "no", column = "no"),
              @Result(property="bookCommentList",column="no",javaType=List.class,
                      many=@Many(select="com.hundsun.book.mapper.BookOperationMapper.getBookCommentByNo"))
    })
    List<Book> getBookList();


    @Insert({"insert into book_info(id, no, name, author, status, introduce, url}) values(#{id}, #{no}, #{name}, #{author}, #{status}, #{introduce}, #{url}"})
    void addBook(Book book);


    @Select("select * from book_info")
    Book updateBook(Book book);


    @Delete("delect from book_info where no=#{id}")
    void deleteBook(@Param("id") String id);
}
