package cre.limit;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:/applicationContext.xml")
public class LimitApplication implements ApplicationContextAware {

//    private static ApplicationContext application;

	public static void main(String[] args) {
		SpringApplication.run(LimitApplication.class, args);

	}

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        application = applicationContext;
    }
}
