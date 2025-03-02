package co.devskills.springbootboilerplate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import co.devskills.springbootboilerplate.models.RestaurantOrderRequest;

@RestController
public class Challenge3Controller {

    @PostMapping("/challenge-3")
    public String implementation(@RequestBody RestaurantOrderRequest input) {
        String order = input.getOrder();

        // Write the code for Challenge 3 here

        return "";
    }
}