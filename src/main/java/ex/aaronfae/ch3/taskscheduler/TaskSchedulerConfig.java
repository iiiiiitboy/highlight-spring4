package ex.aaronfae.ch3.taskscheduler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan
@EnableScheduling
public class TaskSchedulerConfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
