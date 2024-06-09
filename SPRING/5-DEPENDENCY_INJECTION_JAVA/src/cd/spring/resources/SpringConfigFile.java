package cd.spring.resources;

import cd.spring.Address;
import cd.spring.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createobj(){
        Address add = new Address(12,"Indore",123456);
//        add.setHouseno(12);
//        add.setCity("Indore");
//        add.setPincode(123456);
        return add;
    }
     @Bean
    public Student createobj2(){
       Student std = new Student("Sambhav",23,createobj());
//        std.setName("Sambhav");
//        std.setRoll(23);
//        std.setAddress(createobj());
        return std;
     }
}
