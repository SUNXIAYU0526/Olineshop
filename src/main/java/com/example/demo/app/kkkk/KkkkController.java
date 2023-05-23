package com.example.demo.app.kkkk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kkkk")
public class KkkkController {
	
	@GetMapping("/toppage")
	public String toppage(Model model) {
		model.addAttribute("title", "KKKKTOPPAGE");
		return "kkkk/toppage";
	}
	@GetMapping("/lady")
	public String lady(Model model) {
		model.addAttribute("title", "Lady");
		return "kkkk/lady";
	}
}
	
	  
			
	



