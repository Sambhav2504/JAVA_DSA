package com.project.runrate.service;


import com.project.runrate.helper.Match;
import com.project.runrate.helper.Team;
import com.project.runrate.model.RunRateRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NRRService {

    @Autowired
    private Match match;

    public double nrrCalculator(List<RunRateRequestBody> runRateRequestBodyList){
        Team teamA = new Team("Team A");
        double nrr = 0.0;
        Team[] teamsBCD = { new Team("Team B"),new Team("Team C"), new Team("Team D")  };

        for(int i = 0; i < teamsBCD.length; i++) {
            Team team = teamsBCD[i];
//            Match match = new Match(teamA, team);

           nrr =  match.playMatch(runRateRequestBodyList.get(i),teamA,team);
        }
        return nrr;

    }
}
