package com.qd05.req;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Member {

	@RequestMapping("/temp")
	public @ResponseBody String root() throws Exception{
		return "Print OK"; 
	}
	
	@RequestMapping("/")
	public String mtdIndex() {
		return "index"; //jsp 파일명이자 view 명칭
		
	}
	
	@RequestMapping("/send")
	public String mtdSend() {
		return "mem/login"; //jsp 파일명이자 view 명칭
		
	}
	@RequestMapping("/receive")
	public String mtdReceive(HttpServletRequest req, Model model) {
		String userEmail;
		String userPw;
		
		try {
			req.setCharacterEncoding("UTF-8");
			userEmail = req.getParameter("userEmail");
			userPw = req.getParameter("userPw");
			model.addAttribute("userEmail", userEmail);
			model.addAttribute("userPw", userPw);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "/mem/loginProc"; //jsp 파일명이자 view 명칭
		
	}
	
}
