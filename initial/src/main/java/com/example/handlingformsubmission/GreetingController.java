package com.example.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

// Sprint Framework Controller
@Controller
public class GreetingController {

    // This method handles GET requests to "/greeting" endpoint
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        // Create a new instance of the Greeting class and add it to the model
        model.addAttribute("greeting", new Greeting());
        // Return the name of the Thymeleaf template to render (in this case, "greeting.html")
        return "greeting";
    }

    // This method handles POST requests to "/greeting" endpoint
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        // Add the submitted Greeting object to the model
        model.addAttribute("greeting", greeting);
        // Return the name of the Thymeleaf template to render (in this case, "result.html")
        return "result";
    }

}