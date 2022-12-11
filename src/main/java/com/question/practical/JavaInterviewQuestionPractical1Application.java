package com.question.practical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaInterviewQuestionPractical1Application {

	
	private static final Logger log = LoggerFactory.getLogger(JavaInterviewQuestionPractical1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(JavaInterviewQuestionPractical1Application.class, args);
		log.info("Java interview question practical1 application.........");
	}

}
