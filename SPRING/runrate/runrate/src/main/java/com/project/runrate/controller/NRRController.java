package com.project.runrate.controller;

import com.project.runrate.model.RunRateRequestBody;
import com.project.runrate.service.NRRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NRRController {
    @Autowired
    private NRRService nrrService;

    @GetMapping("/Hello")
    String home(){
        return "Hello Runners!";
    }
    @PostMapping("/nrr")
    public String  nrrCalculator(@RequestBody List<RunRateRequestBody> runRateRequestBodyList){
        double nrr = nrrService.nrrCalculator(runRateRequestBodyList);
        return String.valueOf(nrr);

    }


}
