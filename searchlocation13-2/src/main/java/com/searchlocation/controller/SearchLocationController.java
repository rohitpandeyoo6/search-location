package com.searchlocation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchLocationController {
	@RequestMapping("/searchLocation")
	public String showSearchLocation() {
		return "searchLocation";
		
	}
	@RequestMapping("/findLocation")
	public String findLocationById(@RequestParam("id") long id) {
		System.out.println(id);
		return "";
		
	}

}
