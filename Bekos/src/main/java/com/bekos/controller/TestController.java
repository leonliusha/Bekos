package com.bekos.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
@RequestMapping("/")
public class TestController {
	@RequestMapping(value="/welcom", method=RequestMethod.GET)
	public String welcome(ModelMap model){
		model.addAttribute("message","Maven Web Project + Spring 3 MVC - welcome()");
		return "index";
	}
	
	@RequestMapping(value="/welcome/{name}",method=RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model){
		model.addAttribute("message","Maven Web Project + Spring 3 MVC - " + name);
		return "index";
	}
}
