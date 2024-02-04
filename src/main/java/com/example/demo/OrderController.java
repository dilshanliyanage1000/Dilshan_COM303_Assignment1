package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {
	
	@GetMapping("/")
	public String getPage(@ModelAttribute Order order) {
		return "index";
	}

    @PostMapping("/submitOrder")
    public String submitOrder(@ModelAttribute Order order, BindingResult bindingResult, Model model) {

    	if (bindingResult.hasErrors()) {
            return "index";
        }

        model.addAttribute("firstName", order.getFirstName());
        model.addAttribute("email", order.getEmail());
        model.addAttribute("phoneNumber", order.getAreaCode() + "-" + order.getPhoneNumber());
        model.addAttribute("address", order.getStreetAddress() + ", " + order.getCity() + ", " + order.getStateProvince() + ", " + order.getPostalZipCode() + ", " + order.getCountry());
        model.addAttribute("phoneBrand", order.getPhoneBrand());
        model.addAttribute("phoneModel", order.getPhoneModel());
        model.addAttribute("phonePrice", "979.00");
        model.addAttribute("quantity", order.getQuantity());

        double totalPrice = order.getQuantity() * 979.00;
        model.addAttribute("totalPrice", totalPrice);

        return "show-order";
    }
}

