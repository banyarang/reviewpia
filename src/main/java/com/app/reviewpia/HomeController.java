package com.app.reviewpia;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.user.User;

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
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
    public String about() {
		logger.info("about");
        return "about";
    }
   
    @RequestMapping(value="/about", method=RequestMethod.POST)
    public String about(String email, String passwd, HttpSession session) throws Exception {
    	logger.info("about");
    	return "about";
    }
    
    @RequestMapping(value="/trip", method=RequestMethod.GET)
    public String trip() {
    	logger.info("trip");
        return "trip";
    }
   
    @RequestMapping(value="/trip", method=RequestMethod.POST)
    public String trip(String email, String passwd, HttpSession session) throws Exception {
    	logger.info("trip");
    	return "trip";
    }
    
    @RequestMapping(value="/manage", method=RequestMethod.GET)
    public String manage() {
    	logger.info("manage");
        return "manage";
    }
   
    @RequestMapping(value="/manage", method=RequestMethod.POST)
    public String manage(String email, String passwd, HttpSession session) throws Exception {
    	logger.info("manage");
    	return "manage";
    }
	
}
