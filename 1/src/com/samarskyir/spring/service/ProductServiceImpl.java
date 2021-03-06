package com.samarskyir.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.samarskyir.spring.dao.ProductDAO;
import com.samarskyir.spring.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	//need to inject customer dao
	@Autowired
	private ProductDAO productDAO;
	
	
	@Override
	@Transactional
	public List<Product> getProducts() {
		return productDAO.getProducts();
	}


	@Override
	@Transactional
	public void saveProduct(Product theProduct) {
		
		productDAO.saveProduct(theProduct);
		
	}


	@Override
	@Transactional
	public Product getProduct(int theID) {
	
		return productDAO.getProduct(theID);
	}


	@Override
	@Transactional
	public void deleteProduct(int theID) {
		
		productDAO.deleteProduct(theID);
		
	}

}
