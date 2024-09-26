package com.demo.myblog;

import com.demo.myblog.config.TestcontainersConfiguration;
import org.springframework.boot.SpringApplication;

public class TestMyblogApplication {

	public static void main(String[] args) {
		SpringApplication.from(MyblogApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
