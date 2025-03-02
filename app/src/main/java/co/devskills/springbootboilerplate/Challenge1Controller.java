package co.devskills.springbootboilerplate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Challenge1Controller {

    @PostMapping("/challenge-1")
    public int implementation(
            @RequestBody int[] array) {

        // Write the code for Challenge 1 here

        return -1;
    }
}