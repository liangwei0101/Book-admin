package com.hundsun.book.controller;

import com.hundsun.book.service.impl.service.WebSocketService;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * websocket
 * 消息推送(个人和广播)
 */
//@RestController
public class WebSocketController {
//    @Autowired
//    private WebSocketService webSocketService;
//
//    @RequestMapping(value = "/index")
//    public String idnex() {
//        return "index";
//    }
//
//    @RequestMapping(value = "/admin")
//    public String admin(Model model) {
//        return "admin";
//    }
//
//    /**
//     * 个人信息推送
//     * @return
//     */
//    @RequestMapping("sendmsg")
//    @ResponseBody
//    public String sendmsg(String msg,String username){
//        //第一个参数 :msg 发送的信息内容
//        //第二个参数为用户长连接传的用户人数
//        String [] persons = username.split(",");
//        webSocketService.SendMany(msg,persons);
//        return "success";
//    }
//
//    /**
//     * 推送给所有在线用户
//     * @return
//     */
//    @RequestMapping("sendAll")
//    @ResponseBody
//    public String sendAll(String msg){
//        webSocketService.sendAll(msg);
//        return "success";
//    }
//
//    /**
//     * 获取当前在线用户
//     * @return
//     */
//    @RequestMapping("webstatus")
//    public String webstatus(){
//        //当前用户个数
//        int count = webSocketService.getOnlineNum();
//        //当年用户的username
//        webSocketService.getOnlineUsers();
//        return "tongji";
//    }
}
