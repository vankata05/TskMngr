package com.example.TaskMngr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCntrl {

	@RequestMapping("/home")
	public String home() {
		return "index";
	}

}
