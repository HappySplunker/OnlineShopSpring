package com.samarskyir.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samarskyir.spring.dao.ProductDAO;
import com.samarskyir.spring.entity.Product;
import com.samarskyir.spring.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	
	// need to inject our product service
	@Autowired
	private ProductService productService;
	
	@GetMapping("/list")
	public String listProducts(Model theModel) {
		
		//get products from the dao
		List<Product> theProducts = productService.getProducts();
		
		//add the products to the dao
		theModel.addAttribute("products", theProducts);
		
		return "list-products";
	}
}
