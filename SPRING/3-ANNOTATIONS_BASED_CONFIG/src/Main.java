import cd.spring.Student;
import cd.spring.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //String config_loc ="cd/spring/resources/ApplicationContext.xml";
        //ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);ANNOTATION USING XML FILE
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);//ANNOTATION USING JAVA CLASS
        Student std = (Student) context.getBean("student");//here s needs to be small as object is created as student
        std.display();
    }
    }
