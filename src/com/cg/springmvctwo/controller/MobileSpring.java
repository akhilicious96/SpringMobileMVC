package com.cg.springmvctwo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.springmvctwo.dto.Mobile;
import com.cg.springmvctwo.service.IMobileService;


@Controller
public class MobileSpring {
	
	@Autowired
	IMobileService mobileService;
	

	@RequestMapping(value = "/home")
	public String getAllMobile(@ModelAttribute("my") Mobile mob, Map<String, Object> model){
		
		List<String> myList = new ArrayList<>();
		myList.add("Android");
		myList.add("iPhone");
		myList.add("Windows");
		
		model.put("cato", myList);
		
		
		
		return "AddMobile";
	}
	
	@RequestMapping(value = "adddata", method = RequestMethod.POST)
	public String addMobileData(@ModelAttribute("my") Mobile mobile){
		
		mobileService.addMobile(mobile);
		
		return "success";
	}
	
	
}
