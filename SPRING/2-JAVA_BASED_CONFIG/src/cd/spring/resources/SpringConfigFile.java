package cd.spring.resources;

import cd.spring.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//@Bean("createobj")
//public class objstd1(){
//    Student std = new Student();
//    std.setName("Sambhav");
//        std.setEmail("sambhav@gmail.com");
//        std.setRoll(23);
//        return std;
//
//}
@Configuration
public class SpringConfigFile {
    //CREATE A METHOD NAMED AFTER YOUR OBJECT and return type should be a class
    //NAME OF BEAN AND OBJECT CAN BE CHANGED @BEAN("OBJSTD") AND NAME OF METHOD ALSO. WE PROVIDE THE NAME OF BEAN
    @Bean("createobj")
    public Student stdid1(){
        Student std = new Student();
        std.setName("Sambhav");
        std.setEmail("sambhav@gmail.com");
        std.setRoll(23);
        return std;
    }
}