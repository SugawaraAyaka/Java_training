package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class addCalc1 {
	@RequestMapping(value="entryPage", method=RequestMethod.GET)
	public ModelAndView addCalc(ModelAndView mav) {
		mav.setViewName("entryPage");
		return mav;
	}



	@RequestMapping(value="/resultPage", method=RequestMethod.POST)
	public ModelAndView resultPage(@RequestParam("num")Integer num,
			ModelAndView mav) {
		mav.setViewName("resultPage");
		mav.addObject("msg",num * 3);
		return mav;
	}
}