//	DILSHAN LIYANAGE 301-279-203
//	SUBMITTED IN 04-FEB-2024

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
		//When the URL has "/", the page is directed to the index.html file
		return "index";
	}
	
	@GetMapping("/homePage")
    public String homePage() {
		//When the URL has "/homePage", the page is directed to the homepage.html file
        return "homepage";
    }

    @PostMapping("/submitOrder")
    public String submitOrder(@ModelAttribute Order order, BindingResult bindingResult, Model model) {

		//When the URL has "/submitOrder", the page is directed to the index.html file
    	

		//if there are any binding errors with the form object, the controller will redirect the page to the index.html file
    	if (bindingResult.hasErrors()) {
            return "index";
        }

    	//Adding all the key/value attributes to the order model
        model.addAttribute("firstName", order.getFirstName());
        model.addAttribute("email", order.getEmail());
        model.addAttribute("phoneNumber", order.getAreaCode() + "-" + order.getPhoneNumber());
        model.addAttribute("address", order.getStreetAddress() + ", " + order.getCity() + ", " + order.getStateProvince() + ", " + order.getPostalZipCode() + ", " + order.getCountry());
        model.addAttribute("phoneBrand", order.getPhoneBrand());
        model.addAttribute("phoneModel", order.getPhoneModel());
        model.addAttribute("phonePrice", "979.00");
        model.addAttribute("quantity", order.getQuantity());

        //calculating the price with the quantity
        double totalPrice = order.getQuantity() * 979.00;
        model.addAttribute("totalPrice", totalPrice);

        //After the all the the values are added to the model, the data is sent to the show-order file
        return "show-order";
    }
}

