package com.samarskyir.spring.dao;

import java.util.List;

import com.samarskyir.spring.entity.Product;

public interface ProductDAO {
	
	public List<Product> getProducts();

	public void saveProduct(Product theProduct);

	public Product getProduct(int theID);

	public void deleteProduct(int theID);
}
