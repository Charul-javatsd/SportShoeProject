package com.example.demo.controller;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
@Controller
public class UserController {
	@Autowired
	UserDao dao;
	@RequestMapping("/userlogin")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
		
		String Uname=request.getParameter("uname");
		String pass1=dao.getUserPass(Uname);
		String Upwd=request.getParameter("userpwd");
		
		if(pass1!=null){
			if(pass1.equals(Upwd)) {
			String msg="Welcome User!!!";
				mv.addObject("msg",msg);
				mv.setViewName("displayShoeToUser.jsp");
			}
			else {
				String msg="Incorrect Password!!!";
				mv.addObject("msg",msg);
				mv.setViewName("userlogin1.jsp");
			}
		}
		else {
			
			String msg="Not A Registered User/SignUp!!!";
			mv.addObject("msg",msg);
			mv.setViewName("userSignUp.jsp");
		}

		return mv;
	}
	@RequestMapping("/insertuser")
	public ModelAndView insertControlU(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User u =new User();
		
		u.setUname(request.getParameter("uname"));
		u.setUserpwd(request.getParameter("userpwd"));
		
		User u1=dao.insert(u);
		
		if(u1!=null) {
		String msg="SignUp Successful!!!";
				mv.addObject("msg",msg);
				mv.setViewName("userlogin.jsp");
			}
		return mv;
		 
		}
		
}

