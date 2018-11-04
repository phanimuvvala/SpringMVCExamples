package com.gss.egp.cptu;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class JavaController 
{
	@RequestMapping("/codeTest")
	public ModelAndView helloWorld(ModelMap model, HttpServletRequest request) 
	{
	 
	   String message =  "Welcome to CodeTest Spring MVC Sessions";
	   message += "<br>You completed it....!";
	 
	   System.out.println(message);
       model.addAttribute("message", message);
     
	   return new ModelAndView("welcomePage", "welcomeMessage", message);
	}//ModelAndView closed
}
