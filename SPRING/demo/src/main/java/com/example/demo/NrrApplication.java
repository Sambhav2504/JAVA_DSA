package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NrrApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(NrrApplication.class, args);
		Team teamA = new Team("Team A");
		Team[] teamsBCD = { new Team("Team B"),new Team("Team C"), new Team("Team D")  };


		for(int i = 0; i < teamsBCD.length; i++) {
			Team team = teamsBCD[i];
			Match match = new Match(teamA, team);
			match.playMatch();
		}

		System.out.println("Team A NRR: " + teamA.calculateNRR());
	}

}