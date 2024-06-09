package com.sambhav.runners;

import com.sambhav.runners.run.Location;
import com.sambhav.runners.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


@SpringBootApplication
public class RunnersApplication {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(RunnersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnersApplication.class, args);
		logger.info("Something Changed");
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			Run run = new Run(1,"FirstRun", LocalDateTime.now(),LocalDateTime.now().plus(1, ChronoUnit.HOURS),5, Location.OUTDOOR);
            logger.info("run{}", run);
		};
	}

}
		//USING LOGGER
//		logger.info("Application Started Successfully");

		//BY SPRING CONTAINER
//		ApplicationContext context = SpringApplication.run(RunnersApplication.class, args);
//		WelcomeMessage welcomemessage = (WelcomeMessage) context.getBean("welcomeMessage");
//		System.out.println(welcomemessage);

        //BY CREATING OBJECT
//		var welcomeMessage = new WelcomeMessage();
//		welcomeMessage.getWelcomeMessage();
//		System.out.println(welcomeMessage.getWelcomeMessage());

