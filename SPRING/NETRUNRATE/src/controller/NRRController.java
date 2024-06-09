package controller;

@RestCo
public class NRRController {


    @GetMapping("/Hello")
    String home(){
        return "Hello Runners!";
    }
}
