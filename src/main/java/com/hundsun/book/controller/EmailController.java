package com.hundsun.book.controller;

import com.hundsun.book.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/eamil")
public class EmailController {

    @Autowired
    private JavaMailSender javaMailSender; //自动注入的Bean
    private Map<String,Object> userInfoMap = new HashMap<>();

    @RequestMapping(value = "/{no}", method = RequestMethod.GET)
    void getVerificationCode(@PathVariable String eamilStr) {
        String randomNumber = Util.RandomNumber();
        userInfoMap.put(eamilStr,randomNumber);
        SendEamil(randomNumber);
    }

    @RequestMapping(method = RequestMethod.POST)
    Integer ConfirmCode(String eamil ,String code) {
       String saveCode = userInfoMap.get(eamil).toString();
       if(saveCode == code){
            return 200;
       }else {
           return -1;
       }
    }

    private void SendEamil(String randomNumber){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("272262983@qq.com"); //发送者
        message.setTo("liangwei19145@hundsun.com"); //接受者
        message.setSubject("测试"); //发送标题
        message.setText("本次验证码: " + randomNumber);  //发送内容
        javaMailSender.send(message);
        System.out.println("邮件发送成功");
    }
}
