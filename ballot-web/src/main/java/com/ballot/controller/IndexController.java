package com.ballot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ballot.entity.USER;
import com.ballot.entity.VOTER;
import com.ballot.service.LoginService;


@Controller
public class IndexController {

	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/vote", method = RequestMethod.POST) 
	public ModelAndView vote(VOTER voter){
		logger.info("投票：");
		int id = voter.getUserId();
		USER user = loginService.findUserById(id);
		int vNum = user.getVoteNum()+1;
		user.setVoteNum(vNum);
		
		loginService.updateUser(user);
		
				
		List<USER> users = loginService.findALLUser();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("users", users);
		return mv;
	}
}
