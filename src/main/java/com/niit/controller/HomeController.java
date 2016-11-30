package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	
	@RequestMapping("/")
	public ModelAndView Home()
	{
		return new ModelAndView("LandingPage");
	}
	@RequestMapping("Login")
	public ModelAndView Home()
	{
		return new ModelAndView("Login");
	}

}
