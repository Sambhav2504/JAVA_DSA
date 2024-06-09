package com.sambhav.sambhav;

//@Component SERVICE,REPOSITORY EXTENDS COMPONENT
//@Repository

public class FirstClass {
     private String myvar;

     public FirstClass(String myvar) {
        this.myvar = myvar;
    }

    public String SayHello(){
        return "hello from FirstClass==> myvar = " + myvar;
    }
}
