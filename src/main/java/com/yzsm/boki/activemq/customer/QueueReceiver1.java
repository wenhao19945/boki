package com.yzsm.boki.activemq.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import com.yzsm.boki.entity.CilckLog;
import com.yzsm.boki.service.CilckLogService;
import com.yzsm.boki.util.ObjectUtil;

@Component
public class QueueReceiver1 {
	
   @Autowired
   private CilckLogService clickService;
   
   /// <summary>
   /// 日志记录
   /// </summary>
   private static Logger logger = LoggerFactory.getLogger(QueueReceiver1.class.getName());
    
   @JmsListener(destination = "queue1",containerFactory="queueListenerFactory")
   public void receiveQueue(String text) {
      logger.info("===========队列消费者1：Queue接受的消息为==============:" + text);
      CilckLog cilckLog = ObjectUtil.strToObject(text, CilckLog.class);
	  int res = this.clickService.insertSelective(cilckLog);
	  logger.info("===========执行结果==============:" + res);
   }

   //如果多个消费者同时消费1个队列，QueueReceiver写多个
}
