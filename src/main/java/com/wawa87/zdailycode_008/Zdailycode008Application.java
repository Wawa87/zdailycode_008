package com.wawa87.zdailycode_008;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Zdailycode008Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(Zdailycode008Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ZDailyCode_008 running...");
	}
}
