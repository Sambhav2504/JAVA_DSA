package com.project.runrate.helper;

import com.project.runrate.model.RunRateRequestBody;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class Match {
    private Team teamA;
    private Team teamB;
    private String batter;




    public double playMatch(RunRateRequestBody runRateRequestBody, Team teamA, Team team) {
        this.teamA = teamA;
        this.teamB = team;

        System.out.println("Enter the name of batting team : ");
        batter = runRateRequestBody.getBattingFirstTeam();

        if(!this.teamA.getName().equalsIgnoreCase(batter.trim())){
            Team temp =teamB;
            teamB= this.teamA;
            this.teamA =temp;
        }

        System.out.println("Enter runs scored by " + this.teamA.getName());
        int teamARuns = Integer.valueOf(runRateRequestBody.getTeamAScore());

        System.out.println("Enter overs played by " + this.teamA.getName());
        double oversPlayedByA = Double.valueOf(runRateRequestBody.getTeamAOvers());

        System.out.println("Enter wickets lost by " + this.teamA.getName());
        int wicketsLostByA = Integer.valueOf(runRateRequestBody.getTeamAWickets());

        System.out.println("Enter runs scored by " + teamB.getName());
        int teamBRuns = Integer.valueOf(runRateRequestBody.getTeamBScore());

        System.out.println("Enter overs played by " + teamB.getName());
        double oversPlayedByB = Double.valueOf(runRateRequestBody.getTeamBOvers());

        System.out.println("Enter wickets lost by " + teamB.getName());
        int wicketsLostByB = Integer.valueOf(runRateRequestBody.getTeamBWickets());

        if (wicketsLostByA == 10) {
            oversPlayedByA = 20.0;
        }

        if (wicketsLostByB == 10) {
            oversPlayedByB = 20.0;
        }

        this.teamA.RunsScored(teamARuns);
        this.teamA.RunsConceded(teamBRuns);
        this.teamA.OversPlayed(oversPlayedByA);
        this.teamA.OversBowled(oversPlayedByB);

        teamB.RunsScored(teamBRuns);
        teamB.RunsConceded(teamARuns);
        teamB.OversPlayed(oversPlayedByB);
        teamB.OversBowled(oversPlayedByA);

        if(teamARuns>teamBRuns){
            System.out.println("winner of Match is : " + this.teamA.getName());
        }
        else{
            System.out.println("winner of Match is : " + teamB.getName());
        }

        System.out.println("Current nrr of "+ this.teamA.getName() + " is : " + this.teamA.getNRR());
        System.out.println("Current nrr of "+ teamB.getName() + " is : " + teamB.getNRR());
        return this.teamB.getNRR();
    }
}