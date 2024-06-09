package cd.spring.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cd.spring")//for multiple packages @ComponentScan({cd.spring,cd.spring.1,.....})//base package={cd.spring}
public class SpringConfigFile {

}
