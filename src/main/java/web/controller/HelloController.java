package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
        messages.add("Attention! In order to switch to the car ladder, you need to do the following." +
                "Click on the link at the top and add /cars?count=# " +
                "Where # is the number of cars you want to get.");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}