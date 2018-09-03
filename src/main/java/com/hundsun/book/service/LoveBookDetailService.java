package com.hundsun.book.service;

import com.hundsun.book.model.LoveBookDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LoveBookDetailService {

    List<LoveBookDetail> getByUserId(@Param("userId") String userId);

    void add(LoveBookDetail loveBookDetail);

    void delete(@Param("no") Integer no);
}
