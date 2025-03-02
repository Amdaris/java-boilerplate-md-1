package co.devskills.springbootboilerplate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Challenge2Controller {

    @PostMapping("/challenge-2")
    public int[] implementation(
            @RequestBody int[] array) {

        // Write the code for Challenge 2 here

        return null;
    }
}