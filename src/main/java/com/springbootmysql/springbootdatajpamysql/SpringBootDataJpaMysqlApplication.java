package com.springbootmysql.springbootdatajpamysql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootmysql.springbootdatajpamysql.exception.NotFoundException;

@SpringBootApplication
public class SpringBootDataJpaMysqlApplication {

	private static final Logger logger = LoggerFactory.getLogger(NotFoundException.class);

	public static void main(String[] args) {
		logger.info("SpringBootDataJpaMysqlApplication");
		SpringApplication.run(SpringBootDataJpaMysqlApplication.class, args);
		logger.info("SpringBootDataJpaMysqlApplication");
	}

}
