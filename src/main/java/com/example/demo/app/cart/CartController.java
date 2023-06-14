package com.example.demo.app.cart;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.CartEntity;
import com.example.demo.service.CartService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/commodity")
public class CartController {
	
	private final CartService cartService;
	private final CartService CommodityService;
	@Autowired
    public CartController(CartService cartService, CartService commodityService) {
        this.cartService = cartService;
		this.CommodityService = commodityService;
    }
	@GetMapping("/commoditypage")
	public String commoditypage(Model model) {
		model.addAttribute("title", "commoditypage");
		return "commodity/commoditypage";
	}
	@PostMapping("/commoditypage")
	public String formGoBack( Model model) {
		model.addAttribute("title", "commoditypage");
		return "commodity/commoditypage";
	}
	
	@GetMapping("/carttt")
	public String cattt(Model model) {
		model.addAttribute("title", "carttt");
		return "commodity/carttt";
	}
//	/** cartのリンク押下*/
//	@PostMapping("/cartlist")
//	public String cart(Model model) {
//		List<CartEntity>list = cartService.getAll();
//		
//		model.addAttribute("cartList", list);
//		model.addAttribute("title", "cartlist");
//		
//		return "commodity/cartlist";
//	}
//	

	
	/** cartに入りのボタン押下*/
	@PostMapping("/cartconfirm")
	public String cartconfirm(@Validated CartForm cartForm,
			BindingResult result,
			Model model) {
		
		if (result.hasErrors()) {
			model.addAttribute("title", "CartForm");
			return "commodity/commoditypage";
		}
		model.addAttribute("title", "Cart Confirm Page");
		return "/commodity/cartconfirm";
	}
	/**cartに入り のconfirmボタン押下*/
	@PostMapping("/cartok")
	public String cartwok(
			@Valid @ModelAttribute  CartForm cartForm,
			BindingResult result,
			Model model,
			RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			model.addAttribute("title", "CartForm");
			return "commodity/commoditypage";
		}
		CartEntity cartNew = new CartEntity();
		cartNew.setComno(cartForm.getComno());
		cartNew.setComcategory(cartForm.getComcategory());
		cartNew.setComname(cartForm.getComname());
		cartNew.setColour(cartForm.getColour());
		cartNew.setSiz(cartForm.getSiz());
		cartNew.setPhoto(cartForm.getPhoto());
		cartNew.setPrice(cartForm.getPrice());
		cartNew.setQuantity(cartForm.getQuantity());
		cartNew.setCreated(LocalDateTime.now());

		cartService.save(cartNew);
		redirectAttributes.addFlashAttribute("cartok", "success!");
		return "redirect:/commodity/commoditypage";
	}
}

