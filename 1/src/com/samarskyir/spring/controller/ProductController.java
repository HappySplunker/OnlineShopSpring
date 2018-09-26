package com.samarskyir.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samarskyir.spring.dao.ProductDAO;
import com.samarskyir.spring.entity.Product;

@Controller
@RequestMapping("/product")
public class ProductController {

	//need to inject the product dao
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("/list")
	public String listProducts(Model theModel) {
		
		//get products from the dao
		List<Product> theProducts = productDAO.getProducts();
		
		//add the products to the dao
		theModel.addAttribute("products", theProducts);
		
		return "list-products";
	}
}
