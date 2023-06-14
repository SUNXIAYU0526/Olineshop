package com.example.demo.app.cartlist;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cartlist")
public class CartlistController {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CartlistController(JdbcTemplate jdbcTemplate) {
		this. jdbcTemplate = jdbcTemplate;
	}
	


	@GetMapping("/mycart")
	public String mycart(Model model) {

		String sql = "SELECT comno, comcategory, comname, siz, colour, photo, quantity, price, created, quantity*price AS total FROM cart";
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);		
		model.addAttribute("mycart", resultList);
	

		return "cartlist/mycart";
		
			}
	
	@GetMapping("/deleteMycart")
	public String deleteMycart(@PathVariable int comno) {
	    String sql = "DELETE FROM cart WHERE comno = ?";
	    jdbcTemplate.update(sql, comno);
	    return "redirect:/cartlist/mycart";
	}
	
		
		
	}
	
	
	
	

