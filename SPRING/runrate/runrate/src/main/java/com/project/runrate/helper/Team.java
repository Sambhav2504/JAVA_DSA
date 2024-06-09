package com.project.runrate.helper;

public class Team {
    private String name;
    private int totalRunsScored;
    private double totalOversPlayed;
    private int totalRunsConceded;
    private double totalOversBowled;


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

    public void OversPlayed(double overs) {
        totalOversPlayed += Math.floor(overs) +( (overs % 1)*10)/6.0d;
    }

    public void OversBowled(double over){
        totalOversBowled+=over;
    }

    public double getNRR() {
        return ((double) totalRunsScored /  totalOversPlayed) - ((double) totalRunsConceded /  totalOversBowled);

    }
}