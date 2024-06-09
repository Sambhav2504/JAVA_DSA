package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Team {
    private String name;
    private int totalRunsScored;
    private int totalRunsConceded;
    private int totalOversPlayed;
    private int wicketsLost;

    public Team(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void RunsScored(int runs) {
        totalRunsScored += runs;
    }

    public void RunsConceded(int runs) {
        totalRunsConceded += runs;
    }

    public void OversPlayed(int overs) {
        totalOversPlayed += overs;
    }

    public void WicketsLost(int wickets) {
        wicketsLost = wickets;
    }

    public double calculateNRR() {
        return ((double) totalRunsScored /  totalOversPlayed) - ((double) totalRunsConceded /  totalOversPlayed);
    }

}
