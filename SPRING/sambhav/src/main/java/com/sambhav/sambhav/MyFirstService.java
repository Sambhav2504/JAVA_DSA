package com.sambhav.sambhav;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    public MyFirstService(@Qualifier("bean1") FirstClass fc) {
        this.fc = fc;
    }

    private final FirstClass fc;

//    private Environment environment;
    //     @Autowired
//    public void setEnvironment(Environment environment) {
//        this.environment = environment;
//    }
//
//    public MyFirstService(FirstClass fc) {
//        this.fc = fc;
//    }
//    public String getjavaversion(){
//        return environment.getProperty("java.version");
//    }
//
//    public String getosname(){
//        return environment.getProperty("os.name");
//    }
//    public String readProperty(){
//        return environment.getProperty("my.custom.property");
//    }

     public String Tellstory(){
         return"the dependency is saying "+ fc.SayHello();
     }

}
