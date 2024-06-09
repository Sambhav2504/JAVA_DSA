package cd.spring.resources;
import cd.spring.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Student stdid1(){
        Student std = new Student();
        std.setName("Sambhav");
        std.setRoll(23);
        std.setEmail("sambhav@gmail.com");
        return std;
    }
}
