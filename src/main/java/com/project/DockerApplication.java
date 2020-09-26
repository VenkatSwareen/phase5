package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {
	
	@GetMapping("/monitor")
    public String Monitor()
    {
        return "Continuous monitoring on docker";
    }

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
