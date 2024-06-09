package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class Match{
    private final Team teamA;
    private final Team teamB;

    public Match(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public void playMatch() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter runs scored by " + teamA.getName());
        int teamARuns = scanner.nextInt();

        System.out.println("Enter runs scored by " + teamB.getName());
        int teamBRuns = scanner.nextInt();

        System.out.println("Enter overs played by " + teamB.getName());
        int oversPlayedByB = scanner.nextInt();

        System.out.println("Enter wickets lost by " + teamB.getName());
        int wicketsLostByB = scanner.nextInt();

        if (wicketsLostByB == 10) {
            teamB.OversPlayed(20);
        }

        teamA.RunsScored(teamARuns);
        teamA.RunsConceded(teamBRuns);
        teamA.OversPlayed(20);

        teamB.RunsScored(teamBRuns);
        teamB.RunsConceded(teamARuns);
    }}
