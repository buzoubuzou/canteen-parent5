package com.hengkun;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
@MapperScan("com.hengkun.dao")
@Slf4j
public class CanteenApplication {
	public static void main(String[] args) {
	SpringApplication.run(CanteenApplication.class, args);
	log.info("springboot启动了");

	}
}
