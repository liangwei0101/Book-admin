package com.hundsun.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 图书信息控制器
 */

@Controller
public class BookInfoController {

    /**
     * 获取图书信息
     */
    @RequestMapping("/")
    @ResponseBody
    public void getBookInfo() {

    }
}
