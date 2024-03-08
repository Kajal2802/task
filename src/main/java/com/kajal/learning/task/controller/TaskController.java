package com.kajal.learning.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring boot";
	}
	
	
    @GetMapping("/search")
    public int searchTasks(
        @RequestParam int num1,
        @RequestParam int num2
    ) {
        // Your logic to process the query parameters
        return num1 + num2;
    }
    
    @GetMapping("/name1/{name}")
    public String name1ByName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}