package com.example.demo.app.customer;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.CustomerNew;
import com.example.demo.service.CustomerNewService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	private final CustomerNewService customerNewService;
	

	@Autowired
	public CustomerController(CustomerNewService customerNewService) {
		this.customerNewService = customerNewService;
	}
	
	@PostMapping("/sample/test")
	public String test(Model model) {
		model.addAttribute("title", "test");
		return "cusromer/sample/test";
	}

	/** customer登録画面のリンク押下*/
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "Login");
		return "customer/login";
	}
	
//	@PostMapping("/mypage")
//	public String newok(@Validated Customer customerNewForm,
//			BindingResult result,
//			Model model,
//			RedirectAttributes redirectAttributes) {
//		if (result.hasErrors()) {
//			model.addAttribute("title", "CustomerNewForm");
//			return "customer/newcust";
//		}
	
	
	
	
	/** */
	@GetMapping("/newcust")
	public String newcust(Model model) {
		model.addAttribute("title", "Newcust");
		return "customer/newcust";
	}
	/**  新規登録画面のボタン押下*/
	@PostMapping("/newcust")
	public String formGoBack(CustomerLogin customerLogin, Model model) {
		model.addAttribute("title", "Newcust");
		return "customer/newcust";
	}

	
	/** 新規登録のconfirmボタン押下*/
	@PostMapping("/confirm")
	public String confirm(@Validated CustomerNewForm customerNewForm,
			BindingResult result,
			Model model) {
		
		if (result.hasErrors()) {
			model.addAttribute("title", "CustomerNewForm");
			return "customer/newcust";
		}
		model.addAttribute("title", "Confirm Page");
		return "customer/confirm";
	}
	
	/** 新規登録の確認画面のnewokボタン押下*/
	@PostMapping("/newok")
	public String newok(@Validated CustomerNewForm customerNewForm,
			BindingResult result,
			Model model,
			RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			model.addAttribute("title", "CustomerNewForm");
			return "customer/newcust";
		}
		CustomerNew customerNew = new CustomerNew();
		customerNew.setCustno(customerNewForm.getCustno());
		customerNew.setCustname(customerNewForm.getCustname());
		customerNew.setCustfurigana(customerNewForm.getCustfurigana());
		customerNew.setMailaddress(customerNewForm.getMailaddress());
		customerNew.setPassword(customerNewForm.getPassword());
		customerNew.setBirthday(customerNewForm.getBirthday());
		customerNew.setSex(customerNewForm.getSex());
		customerNew.setPostno(customerNewForm.getPostno());
		customerNew.setAddress(customerNewForm.getAddress());
		customerNew.setTelno(customerNewForm.getTelno());
		customerNew.setCreated(LocalDateTime.now());

		customerNewService.save(customerNew);
		redirectAttributes.addFlashAttribute("newok", "success!");
		return "redirect:/customer/login";
	}
	
	/** like登録画面のリンク押下*/
	@GetMapping("/like")
	public String like(Model model) {
		model.addAttribute("title", "Like");
		return "customer/like";
	}
	/** basket登録画面のリンク押下*/
	@GetMapping("/basket")
	public String basket(Model model) {
		model.addAttribute("title", "Basket");
		return "customer/basket";
	}
	
	/** custsupport登録画面のリンク押下*/
	@GetMapping("/custsupport")
	public String custsupport(Model model) {
		model.addAttribute("title", "custsupport");
		return "customer/custsupport";
	}
}
