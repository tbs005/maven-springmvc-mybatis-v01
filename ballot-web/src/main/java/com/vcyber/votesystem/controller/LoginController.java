package com.vcyber.votesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vcyber.votesystem.entity.USER;
import com.vcyber.votesystem.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public String defaut(){
		
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET) 
	public ModelAndView login(){
		List<USER> users = loginService.findALLUser();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("users", users);
		return mv;
	}
	
}
