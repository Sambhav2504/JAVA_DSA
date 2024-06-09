package com.sambhav.runners.run;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

public class RunRepository {
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll(){
        return runs;
    }

    @PostConstruct
    private void init(){

    }

}
