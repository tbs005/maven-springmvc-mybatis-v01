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

import com.ballot.entity.USER;
import com.ballot.entity.VOTE;
import com.ballot.service.VoteService;


@Controller
public class VoteController {
	
	private static final Logger logger = LoggerFactory.getLogger(VoteController.class);
	
	@Autowired
	private VoteService voteService;
	
	@RequestMapping(value = "/createvote", method = RequestMethod.POST) 
	public ModelAndView createvote(HttpServletRequest request,VOTE vote){
		logger.info("创建投票：{}",vote.getTitle());
		
		voteService.createVote(vote);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createvote");
		return mv;
	}
	
	@RequestMapping(value = "/addCandidates", method = RequestMethod.GET) 
	public ModelAndView addCandidates(){
		logger.info("添加候选人：");
		List<VOTE> votes = voteService.getAllVote();
		List<USER> users = voteService.getAllUser();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addCandidates");
		mv.addObject("votes", votes);
		mv.addObject("users", users);
		return mv;
	}
	
	
	@RequestMapping(value = "/addVoter", method = RequestMethod.GET) 
	public ModelAndView addVoter(){
		logger.info("添加投票人：");
		List<VOTE> votes = voteService.getAllVote();
		List<USER> users = voteService.getAllUser();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addVoter");
		mv.addObject("votes", votes);
		mv.addObject("users", users);
		return mv;
	}
		
}
