package com.springbootmysql.springbootdatajpamysql.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

@Component
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

	private static final Logger logger = LoggerFactory.getLogger(NotFoundException.class);

	private static final long serialVersionUID = 1L;

	public NotFoundException() {
		super("Not Found!!");
		logger.info("NotFoundException");
	}
}
