package com.yzsm.boki;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@SpringBootApplication(scanBasePackages = "com.yzsm.boki")
@MapperScan("com.yzsm.boki.mapper")
@EnableScheduling
public class BokiApplication {
	
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(BokiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BokiApplication.class, args);
		logger.info("SpringBoot Start Success");
	}
		
	/**
	 * 定时任务多线程配置
	 * @return
	 */
	@Bean
	public TaskScheduler taskScheduler() {
		ThreadPoolTaskScheduler task = new ThreadPoolTaskScheduler();
		task.setPoolSize(10);
		task.setThreadNamePrefix("springboot-task");
		return task;
	}

}
