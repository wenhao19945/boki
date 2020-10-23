package com.yzsm.boki.activemq.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueReceiver2 {

   /// <summary>
   /// 日志记录
   /// </summary>
   private static Logger logger = LoggerFactory.getLogger(QueueReceiver2.class.getName());

   @JmsListener(destination = "queue2",containerFactory="queueListenerFactory")
   public void receiveQueue(String text) {
      logger.info("===========队列消费者2：Queue接受的消息为==============:" + text);
   }

}
