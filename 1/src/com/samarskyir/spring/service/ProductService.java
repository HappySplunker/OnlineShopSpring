package com.samarskyir.spring.service;

import java.util.List;

import com.samarskyir.spring.entity.Product;

public interface ProductService {
	
	public List<Product> getProducts();

	public void saveProduct(Product theProduct);

	public Product getProduct(int theID);

}
