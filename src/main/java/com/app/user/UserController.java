package com.app.user;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
    private UserService userService;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String user() {
		return "user/login";
	}
	
	@RequestMapping(value="/signUp", method=RequestMethod.GET)
	public String signUp() {
		return "user/signUp";
	}
	
	@RequestMapping(value="/signUp", method=RequestMethod.POST)
	public String signUp(User user) throws Exception {
		userService.insert(user);
		return "user/welcome";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
    public String login() {
        return "user/login";
    }
   
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(String email, String passwd, HttpSession session) throws Exception {
        User loginUser = userService.login(email, passwd);
        if (loginUser != null) {
            session.setAttribute("check", loginUser);
            return "user/changePasswd";
        } else {
            return "user/login";
        }
    }
    
}
