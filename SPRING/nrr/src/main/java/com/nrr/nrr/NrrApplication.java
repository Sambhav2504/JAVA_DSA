package com.nrr.nrr;

public class NrrApplication {

	public static void main(String[] args) {

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
