package br.com.developer.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationRest {

	@GetMapping("ping")
	public String test() {
		return "HelloWord";
	}
}
