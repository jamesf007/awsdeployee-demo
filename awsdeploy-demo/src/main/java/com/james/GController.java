package com.james;




import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class GController {



	@RequestMapping("/welcome")
	public String firstPage() {
		return "welcome1";
	}
}