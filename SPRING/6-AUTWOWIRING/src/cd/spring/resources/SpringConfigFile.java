package cd.spring.resources;

import cd.spring.Address;
import cd.spring.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createobj(){
        Address add = new Address();
        add.setHouseno(12);
        add.setCity("Indore");
        add.setPincode(123456);
        return add;
    }
    @Bean
    public Address createobj3(){
        Address add1 = new Address();
        add1.setHouseno(12);
        add1.setCity("Bangalore");
        add1.setPincode(123456);
        return add1;
    }
    @Bean
    public Student createobj2(){
        Student std = new Student();
        std.setName("Sambhav");
        std.setRoll(23);
//        std.setAddress(createobj());
        return std;
    }
}
