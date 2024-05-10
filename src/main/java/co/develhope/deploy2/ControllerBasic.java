package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
