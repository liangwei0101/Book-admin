package com.hundsun.book.service;

import com.hundsun.book.model.WantReadBook;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WantReadBookService {

    List<WantReadBook> getByUserName(@Param("bookName") String bookName);

    List<WantReadBook> getByUserId(@Param("UserId") String UserId);

    List<WantReadBook> getAllList();

    void add(WantReadBook wantReadBook);

    WantReadBook update(WantReadBook wantReadBook);

    void delete(@Param("no") Integer no);
}
