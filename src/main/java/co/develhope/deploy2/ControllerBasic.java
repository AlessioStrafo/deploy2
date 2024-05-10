package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//write a Spring Boot application with the necessary dependencies that:
//has a basic controller that returns the sum of 2 random integers
//runs on:
//port 7070 with profile prod
//port 4000 with profile test
//port 5000 in all the other cases
//the version is 0.0.6
//create the .war and launch it using the command line, using the 2 prod and test profiles:
//java -jar [activeprofile] [packagename]
import java.util.Random;

@RestController
public class ControllerBasic {
    @GetMapping("/sum")
    public int sum() {
        Random numRandom = new Random();
        int num1 = numRandom.nextInt(50);
        int num2 = numRandom.nextInt(50);
        return num1 + num2;
    }
}
