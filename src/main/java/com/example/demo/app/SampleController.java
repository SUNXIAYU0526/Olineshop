package com.example.demo.app;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public SampleController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@PostMapping("/test")
	public String test(Model model) {
		
		String sql = "SELECT comno, comcategory, comname "
				+"FROM commodity WHERE comno = 1";
		Map<String,Object> map = jdbcTemplate.queryForMap(sql);
				
		model.addAttribute("title","Commodity Form" );
		model.addAttribute("comcategory",map.get("comcategory" ));
		model.addAttribute("comname",map.get("comname" ));
		return "test";
	}

}