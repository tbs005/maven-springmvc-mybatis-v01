package com.ballot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ballot.entity.BALLOT;
import com.ballot.entity.USER;
import com.ballot.service.BallotService;


@Controller
public class BallotController {
	
	private static final Logger logger = LoggerFactory.getLogger(BallotController.class);
	
	@Autowired
	private BallotService ballotService;
	
	@RequestMapping(value = "/createballot", method = RequestMethod.POST) 
	public ModelAndView createballot(HttpServletRequest request,BALLOT ballot){
		logger.info("创建投票：{}",ballot.getTitle());
		
		ballotService.createBallot(ballot);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createballot");
		return mv;
	}
	
	@RequestMapping(value = "/addCandidates", method = RequestMethod.GET) 
	public ModelAndView addCandidates(){
		logger.info("添加候选人：");
		List<BALLOT> ballots = ballotService.getAllBallot();
		List<USER> users = ballotService.getAllUser();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addCandidates");
		mv.addObject("ballots", ballots);
		mv.addObject("users", users);
		return mv;
	}
	
	
	@RequestMapping(value = "/addBallotr", method = RequestMethod.GET) 
	public ModelAndView addballotr(){
		logger.info("添加投票人：");
		List<BALLOT> ballots = ballotService.getAllBallot();
		List<USER> users = ballotService.getAllUser();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addballotr");
		mv.addObject("ballots", ballots);
		mv.addObject("users", users);
		return mv;
	}
		
}
