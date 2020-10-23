package com.yzsm.boki.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzsm.boki.activemq.customer.QueueReceiver1;
import com.yzsm.boki.activemq.producer.QueueSender;
import com.yzsm.boki.activemq.producer.TopicSender;

@RestController
public class SendController {
	
	@Autowired
	QueueSender queueSender;
	
	@Autowired
	TopicSender topicSender;
	
	/*
	 * 发送 队列消息
	 */
	@RequestMapping("/sendQueue")
	public String sendQueue() {
	    String message = UUID.randomUUID().toString();
	    // 指定消息发送的目的地及内容
	    queueSender.send1(message);
	    return "消息发送成功！message=" + message;
	}
	
}
