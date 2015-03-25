package com.app.user;

public interface UserService {
	   
    public int insert(User user);
    
    public User login(String email, String passwd);
    
}
