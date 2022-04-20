package com.foodie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodieController {
	
	@GetMapping("hello")
	  public String sayHello() {
	    return "Hello Developer, you are awesome!";
	  }


}
