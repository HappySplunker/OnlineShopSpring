package com.samarskyir.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/showFormForAdd")
	public String showFormAdd(Model theModel) {
		
		//create model attribute to bind form data
		Product theProduct = new Product();
		theModel.addAttribute("product", theProduct);
		
		return "product-form";
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product theProduct) {
		
		productService.saveProduct(theProduct);
		
		
		return "redirect:/product/list";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("productId") int theID, Model theModel) {
		
		//get the product form the service
		Product theProduct = productService.getProduct(theID);
		
		//set product as a model attribute to pre-populate the form
		theModel.addAttribute("product", theProduct);
		
		//send over to our form
		
		return "product-form";
	}
	
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("productId") int theID) {
		
		productService.deleteProduct(theID);
		
		return "redirect:/product/list";
	}
}
