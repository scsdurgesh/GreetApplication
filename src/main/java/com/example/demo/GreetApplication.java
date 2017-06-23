package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GreetApplication {

	@RequestMapping(value="/greeting", method=RequestMethod.GET)
	public String getMsg()
	{
		
		return "Good Morning!!!!!!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(GreetApplication.class, args);
	}
}
