package com.example.demo.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ShoeDao;
import com.example.demo.model.Shoes;



@Controller
public class ShoeController {
	@Autowired
	ShoeDao dao;


	@RequestMapping("/insert")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Shoes s=new Shoes();
		s.setShoeId(Integer.parseInt(request.getParameter("shoeId")));
		s.setShoeName(request.getParameter("shoeName"));
		s.setShoePrice(request.getParameter("shoePrice"));
		Shoes s1=dao.insert(s);
		
		if(s1!=null) {
			mv.setViewName("display.jsp");
		}
		return mv;
	}
	@RequestMapping("/getall")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Shoes> list=dao.getall();
	mv.setViewName("displayres.jsp");
	mv.addObject("list",list);	
		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		
	
Shoes s=new Shoes();
		s.setShoeId(Integer.parseInt(request.getParameter("shoeId")));
		s.setShoeName(request.getParameter("shoeName"));
		s.setShoePrice(request.getParameter("shoePrice"));
	
	
	String s1=dao.update(s);
	if(s1!=null) {
		mv.setViewName("display.jsp");
	}
		else {
			mv.setViewName("error.jsp");
		}
		return mv;
	}
	
	
	@RequestMapping("/delete")
	public ModelAndView delete(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		
       Shoes s =new Shoes();
       s.setShoeId(Integer.parseInt(request.getParameter("shoeId")));

	
		String s2=dao.delete(s);
	if(s2!=null) {
			mv.setViewName("display.jsp");
		}
		else {
			mv.setViewName("error.jsp");
		}
		return mv;
	}
//for user below coding
	//displayShoeToUser
		 @RequestMapping("/displayShoeToUser")
		public ModelAndView displayAllU(HttpServletRequest request,HttpServletResponse response) {
			ModelAndView mv=new ModelAndView();
		List<Shoes> list=dao.getall();
		mv.setViewName("shoeCatalog.jsp");
		mv.addObject("list",list);	
			return mv;
		}
		
		}

