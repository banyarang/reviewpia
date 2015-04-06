package com.app.reviewpia;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.user.User;
import com.app.user.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	 
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, HttpSession session) {
		logger.info("home");
		
		return "index";
	}
	
	@RequestMapping(value="/aboutUs", method=RequestMethod.GET)
    public String aboutUs(Model model) {
		logger.info("aboutUs");
		
        return "aboutUs";
    }
   
    @RequestMapping(value="/aboutUs", method=RequestMethod.POST)
    public String aboutUs(String email, String passwd, HttpSession session) throws Exception {
    	logger.info("aboutUs");
    	return "aboutUs";
    }
    
    @RequestMapping(value="/gallery", method=RequestMethod.GET)
    public String gallery(Model model) {
		logger.info("gallery");
		
        return "gallery";
    }
   
    @RequestMapping(value="/gallery", method=RequestMethod.POST)
    public String gallery(String email, String passwd, HttpSession session) throws Exception {
    	logger.info("gallery");
    	return "gallery";
    }
    
    
}
