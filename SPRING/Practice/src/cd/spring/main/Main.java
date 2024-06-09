package cd.spring.main;

import cd.spring.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    String config_loc = "cd/spring/resources/ApplicationContext.xml";
    ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
    Student std = (Student) context.getBean("stdid");
    Student std2 = (Student) context.getBean("stdid2");
    std.display();
    std2.display();
    }
}
