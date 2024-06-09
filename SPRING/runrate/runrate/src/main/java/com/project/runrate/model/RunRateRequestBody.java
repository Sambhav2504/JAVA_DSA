package com.project.runrate.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RunRateRequestBody {
    public String battingFirstTeam;
    public String teamAScore;
    public String teamAOvers;
    public String teamAWickets;
    public String teamBScore;

    public String getTeamBWickets() {
        return teamBWickets;
    }

    public void setTeamBWickets(String teamBWickets) {
        this.teamBWickets = teamBWickets;
    }

    public String getBattingFirstTeam() {
        return battingFirstTeam;
    }

    public void setBattingFirstTeam(String battingFirstTeam) {
        this.battingFirstTeam = battingFirstTeam;
    }

    public String getTeamAOvers() {
        return teamAOvers;
    }

    public void setTeamAOvers(String teamAOvers) {
        this.teamAOvers = teamAOvers;
    }

    public String getTeamAScore() {
        return teamAScore;
    }

    public void setTeamAScore(String teamAScore) {
        this.teamAScore = teamAScore;
    }

    public String getTeamAWickets() {
        return teamAWickets;
    }

    public void setTeamAWickets(String teamAWickets) {
        this.teamAWickets = teamAWickets;
    }

    public String getTeamBOvers() {
        return teamBOvers;
    }

    public void setTeamBOvers(String teamBOvers) {
        this.teamBOvers = teamBOvers;
    }

    public String getTeamBScore() {
        return teamBScore;
    }

    public void setTeamBScore(String teamBScore) {
        this.teamBScore = teamBScore;
    }

    public String teamBOvers;
    public String teamBWickets;

}
