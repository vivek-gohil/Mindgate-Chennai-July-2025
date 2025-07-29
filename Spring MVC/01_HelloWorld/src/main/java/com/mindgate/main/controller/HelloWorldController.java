package com.mindgate.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	public HelloWorldController() {
		System.out.println("HelloWorldController object created");
	}

	@RequestMapping("/")
	public ModelAndView showHomePage() {
		System.out.println("in showHomePage()");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");

		String message = "This message is sent from Controller";

		modelAndView.addObject("mymessage", message);

		return modelAndView;
	}

	@RequestMapping("one")
	public String showFirstPage() {
		System.out.println("in showFirstPage()");
		System.out.println("Implemented Devtools into Spring MVC");
		return "first";
	}
}
