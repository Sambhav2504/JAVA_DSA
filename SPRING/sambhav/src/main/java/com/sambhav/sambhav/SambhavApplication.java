package com.sambhav.sambhav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SambhavApplication {

	public static void main(String[] args) {
		  var context = SpringApplication.run(SambhavApplication.class, args);
	      MyFirstService myFirstService = context.getBean(MyFirstService.class);
		    System.out.println(myFirstService.Tellstory());
//		    System.out.println(myFirstService.getjavaversion());
//		    System.out.println(myFirstService.getosname());
//		    System.out.println(myFirstService.readProperty());
}

}

