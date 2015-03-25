package com.app.mybatis;

import org.apache.ibatis.annotations.Param;

import com.app.user.User;

public interface UserMapper {
   
    public int insert(User user);
    
    public User login(@Param("email") String email, @Param("passwd") String passwd);

}
