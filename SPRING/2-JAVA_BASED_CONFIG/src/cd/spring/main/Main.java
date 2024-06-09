package cd.spring.main;
import cd.spring.Student;
import cd.spring.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
   // Student std = (Student) context.getBean("stdid1");
        Student std = (Student) context.getBean("createobj");
        //Student std = context.getBean(Student.class);
    std.display();
}

