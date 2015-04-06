package com.app.user;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.reviewpia.HomeController;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
    private UserService userService;

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
    public String login(Model model, String email, String password, HttpSession session) throws Exception {
    	logger.info("login");
    	
    	logger.info("email : "+email);
    	logger.info("password : "+password);
    	
        User loginUser = userService.login(email, password);
        
        logger.info("loginUser -> "+ loginUser);
        
        if (loginUser != null) {
            session.setAttribute("user", loginUser);
            model.addAttribute("loginUser", loginUser);
        } 
        
        return "index";
    }
    
}
