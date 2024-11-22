package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class AppController {
	
	@GetMapping("/hi")
	public String fun1() {
		return "welcome";
	}
	
	@PostMapping("/hi")
	public String fun2() {
		return "welcome by post";
	}
	
	@PutMapping("/hi")
	public String fun3() {
		return "welcome by put";
	}
	
	@DeleteMapping("/hi")
	public String fun4() {
		return "welcome by delete";
	}

}
