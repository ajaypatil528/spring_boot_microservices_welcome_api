package in.ajay.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ajay.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetFeignClient greetlient;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		String greetRespones = greetlient.invokeGreetApi();
		return greetRespones + " welcome message";	
	}
}
