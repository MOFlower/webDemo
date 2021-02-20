package com.web.study.dao;

import com.web.study.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User getUserByUsername(@Param("username") String username, @Param("password") String password);

    User selectUserByUsername(@Param("username") String username);

    void insert(@Param("username") String username, @Param("password") String password);
}
