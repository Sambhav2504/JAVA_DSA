package com.sambhav.sambhav;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfigFile {
    @Bean
    @Qualifier("Bean1")
    public FirstClass MyfirstBean(){
        return new FirstClass("First Bean");
    }
    @Bean
    @Qualifier("Bean2")
    public FirstClass MySecondBean(){
        return new FirstClass("Second Bean");
    }
    @Bean
    @Primary //IN CASE OF MULTIPLE BEANS IT GIVES HIGHER PRIORITY AMONG OTHER BEANS
    public FirstClass MyThirdBean(){
        return new FirstClass("Third Bean");
    }
}
