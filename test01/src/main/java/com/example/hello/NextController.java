package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NextController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/next/n1")
    public String index(Model model) {
		return "next/index";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/next/n1", params = "button1")
    public String button1(Model model) {
		return "next/button1";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/next/n1", params = "button2")
    public String button2(Model model) {
		return "next/button2";
	}


}
