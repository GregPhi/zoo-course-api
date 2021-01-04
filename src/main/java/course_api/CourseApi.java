package course_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CourseApi {

    public static void main(String... args){
        SpringApplication.run(CourseApi.class,args);
        System.out.println("=================================================");
        System.out.println("        -> http://localhost:8083/courses/");
        System.out.println("=================================================");
    }

    @Bean
    @Autowired
    public CommandLineRunner demo(CourseRepository repository) {
    }

}
