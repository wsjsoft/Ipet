package com.suwon.ezen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/customer")
@RestController
public class CustomerController {
	
	@GetMapping("/")
	public ModelAndView custom() {
		ModelAndView md = new ModelAndView();
		md.setViewName("customer");
		
		
		
		
		return md;
	}

}
