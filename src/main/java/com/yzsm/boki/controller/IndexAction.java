package com.yzsm.boki.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.yzsm.boki.activemq.producer.QueueSender;


@RestController
@RequestMapping("/index")
public class IndexAction {
	
	@Autowired
	QueueSender queueSender;

	@RequestMapping(method=RequestMethod.GET,produces="text/html;charset=UTF-8")
	public String index(HttpServletRequest request, HttpServletResponse response){
		return "OK";
	}
	
	@RequestMapping(value = "begin",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String begin(HttpServletRequest request, HttpServletResponse response){
		String parem = request.getParameter("parem");
		try {
			if(null != parem) {
				queueSender.send1(parem);
				return "1";
			}
			return "0";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "err";
		}
	}
	
}
