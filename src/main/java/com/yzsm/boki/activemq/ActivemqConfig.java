package com.yzsm.boki.activemq;

import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

@Configuration
@EnableJms
public class ActivemqConfig {

    public String TOPIC1 = "topic1";
    
    public String TOPIC2 = "topic2";

    public String QUEUE1 = "queue1";
    
    public String QUEUE2 = "queue2";
    
    @Bean
    public Topic topic1() {
        return new ActiveMQTopic(TOPIC1);
    }

    @Bean
    public Topic topic2() {
        return new ActiveMQTopic(TOPIC2);
    }

    @Bean
    public Queue queue1() {
        return new ActiveMQQueue(QUEUE1);
    }

    @Bean
    public Queue queue2() {
        return new ActiveMQQueue(QUEUE2);
    }
	
    /**
     * topic模式的ListenerContainer
     * @return
     */
    @Bean
    public JmsListenerContainerFactory<?> topicListenerFactory() {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        ActiveMQConnectionFactory connectionFactor=new ActiveMQConnectionFactory();
        factory.setPubSubDomain(true);
        factory.setConnectionFactory(connectionFactor);
        return factory;
    }

    /**
     * queue模式的ListenerContainer
     * @return
     */
    @Bean
    public JmsListenerContainerFactory<?> queueListenerFactory() {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        ActiveMQConnectionFactory connectionFactor=new ActiveMQConnectionFactory();
        factory.setPubSubDomain(false);
        factory.setConnectionFactory(connectionFactor);
        return factory;
    }
	
}
