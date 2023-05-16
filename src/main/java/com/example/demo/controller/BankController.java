package com.example.demo.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.dao.BankDao;

@Controller
public class BankController {
	 @Autowired
	BankDao dao;
	 @RequestMapping("/proceedPay")
		public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
			int Bid= Integer.parseInt(request.getParameter("Bid"));
			int balance=dao.getPass(Bid);
			int Balance1=10000;
			
				if(balance==Balance1) {
					String msg="Transaction Successful!!!";
					mv.addObject("msg",msg);
					mv.setViewName("Success.jsp");
				}
				else {
					String msg="wrong balance entered!!!";
					mv.addObject("msg",msg);
					mv.setViewName("Buy.jsp");
				}
			

			return mv;
		}
}
