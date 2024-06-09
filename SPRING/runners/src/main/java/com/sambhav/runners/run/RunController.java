package com.sambhav.runners.run;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RunController {


    @GetMapping("/Hello")
    String home(){
        return "Hello Runners!";
    }
}
