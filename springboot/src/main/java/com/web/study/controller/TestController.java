package com.web.study.controller;

import com.alibaba.fastjson.JSON;
import com.web.study.dao.CommunicationMsgDao;
import com.web.study.entity.CommunicationMsg;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    CommunicationMsgDao communicationMsgDao;

    @RequestMapping("/test")
    public String test() {
        return "hello";
    }

    @RequestMapping("getMsg")
    public String getMsg() {
        List<CommunicationMsg> allMsg = communicationMsgDao.getAllMsg();
        List<CommunicationMsg> buf = new LinkedList<>();
        for (CommunicationMsg msg : allMsg) {
            buf.add(0, msg);
        }
        allMsg = buf;
        HashMap<String, Object> map = new HashMap<>();
        map.put("list", allMsg);
        return JSON.toJSONString(map);
    }

    @RequestMapping("submitMsg")
    public String submitMsg(@RequestBody CommunicationMsg req) {
        communicationMsgDao.insert(req.getMsg(), req.getUsername());
        return "ok";
    }
}
