package com.hundsun.book.service.impl;

import com.hundsun.book.mapper.WantReadBookMapper;
import com.hundsun.book.model.WantReadBook;
import com.hundsun.book.service.WantReadBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WantReadBookServiceImpl implements WantReadBookService {

    @Autowired
    private WantReadBookMapper wantReadBookMapper;

    private LoveBookDetailImpl loveBookDetailImpl = new LoveBookDetailImpl();

    @Override
    public List<WantReadBook> getByUserName(String bookName) {

        return wantReadBookMapper.getByUserName(bookName);
    }

    @Override
    public List<WantReadBook> getByUserId(String userId) {
        return wantReadBookMapper.getByUserId(userId);
    }

    @Override
    public List<WantReadBook> getAllList() {
        return wantReadBookMapper.getAllList();
    }

    @Override
    public void add(WantReadBook wantReadBook) {
        wantReadBookMapper.add(wantReadBook);
    }

    @Override
    public WantReadBook update(WantReadBook wantReadBook) {
        return wantReadBookMapper.update(wantReadBook);
    }

    @Override
    public void delete(Integer no) {
        wantReadBookMapper.delete(no);
    }
}
