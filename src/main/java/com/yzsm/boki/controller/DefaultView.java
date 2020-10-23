package com.yzsm.boki.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 默认启动页
 * @author Administrator
 */
@Controller
public class DefaultView  {
	
	@RequestMapping("/")
	public String index(Model model, HttpServletResponse response) {
	    return "welcome";
	}
	
}
