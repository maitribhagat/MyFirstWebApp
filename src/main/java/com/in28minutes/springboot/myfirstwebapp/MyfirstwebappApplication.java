package com.in28minutes.springboot.myfirstwebapp;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//@ComponentScan(basePackages = "com.in28minutes.springboot.myfirstwebapp.hello" + "com.in28minutes.springboot.myfirstwebapp.login")
@SpringBootApplication
public class MyfirstwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstwebappApplication.class, args);
	}

}