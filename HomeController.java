package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String helloHuman(@RequestParam(value="name", required=false) String userName, @RequestParam(value="last_name", required=false) String lastName, @RequestParam(value="times", required=false) String multiplier)
	{
		String sentence = "";
		if(multiplier == null) {
			multiplier = "1";
		}
		int mult = Integer.parseInt(multiplier);

		for(int i = 0; i < mult; i++) {
			if(userName == null)
			{
				sentence += "Hello Human";
			}
			else if (userName != null && lastName == null)
			{
				sentence += "Hello " + userName;
			}
			else {
				sentence += "hello " + userName + " " + lastName;
			}
			if(i != mult-1) {
				sentence += " ";
			}
		}
//		return sentence.repeat(multiplier);
		return sentence;
	}
}
