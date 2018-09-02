package com.hundsun.book.service.impl;

import com.hundsun.book.mapper.LoveBookDetailMapper;
import com.hundsun.book.model.LoveBookDetail;
import com.hundsun.book.service.LoveBookDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoveBookDetailImpl implements LoveBookDetailService {

    private LoveBookDetailMapper loveBookDetailMapper;

    @Override
    public List<LoveBookDetail> getByUserId(String userId) {
        return loveBookDetailMapper.getByUserId(userId);
    }

    @Override
    public void add(LoveBookDetail loveBookDetail) {
        loveBookDetailMapper.add(loveBookDetail);
    }

    @Override
    public void delete(Integer no) {
        loveBookDetailMapper.delete(no);
    }
}
