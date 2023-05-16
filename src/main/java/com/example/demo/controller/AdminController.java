package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AdminDao;


@Controller
public class AdminController {
    @Autowired
	AdminDao dao;
    @RequestMapping("/")
	public ModelAndView displaypage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}

	
	@RequestMapping("/adminlogin")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
		String Aname=request.getParameter("Aname");
		String pass=dao.getPass(Aname);
		String Apwd=request.getParameter("Apwd");
		if(pass!=null){
			if(pass.equals(Apwd)) {
				String msg="Welcome Admin!!!";
				mv.addObject("msg",msg);
				mv.setViewName("indexshoe.jsp");
			}
			else {
				String msg="Incorrect Password!!!";
				mv.addObject("msg",msg);
				mv.setViewName("adminlogin1.jsp");
			}
		}
		else {
			
			String msg="Not A Registered Admin!!!";
			mv.addObject("msg",msg);
			mv.setViewName("adminlogin1.jsp");
		}

		return mv;
	}
}
