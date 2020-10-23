package com.yzsm.boki.activemq.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicReceiver1 {

   /// <summary>
   /// 日志记录
   /// </summary>
   private static Logger logger = LoggerFactory.getLogger(TopicReceiver1.class.getName());

   @JmsListener(destination = "topic1",containerFactory="topicListenerFactory")
   public void receiveTopic(String text) {
      logger.info("===========主题消费者1：Topic接受的消息为==============:" + text);
   }

    //如果多个消费者同时消费1个主题，TopicReceiver写多个
}
