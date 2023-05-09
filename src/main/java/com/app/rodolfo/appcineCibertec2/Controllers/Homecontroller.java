package com.app.rodolfo.appcineCibertec2.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {

	@GetMapping("/home")
	public String home() {
		
		return "home";
	}
}
