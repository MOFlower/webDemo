package com.web.study.dao;

import com.web.study.entity.CommunicationMsg;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommunicationMsgDao {
    List<CommunicationMsg> getAllMsg();

    void insert(@Param("msg") String msg, @Param("username") String username);
}
