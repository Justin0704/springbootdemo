package com.hrt.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class SpringbootdemoApplication {


/*	@Value(value="${book.author}")
	private String bookAuthor;
	@Value(value="${book.name}")
	private String bookName;
	@Value(value="${book.pinyin}")
	private String bookPinYin;*/


	public static void main(String[] args) {

		SpringApplication.run(SpringbootdemoApplication.class, args);
	}


}
