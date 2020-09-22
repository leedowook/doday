package com.project.doday.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.doday.vo.testInfo;

@Controller
public class userController {
	
	private ModelAndView mav;//얘가 담고있는 내용은 다음 view의 목적지 ,객체들
	
	
	@GetMapping("/user/passwordTest")
	public ModelAndView passtest(@RequestParam("password") String password) {
		testInfo info =new testInfo();
		info.setId("아이디");
		info.setPassword(password);
		mav = new ModelAndView();
		mav.addObject("info",info);
		mav.setViewName("user/passTest");
		
		//return "user/passTest";
		return mav;
	}
}
