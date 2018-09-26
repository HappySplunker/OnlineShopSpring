package com.samarskyir.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.samarskyir.spring.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	//need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<Product> getProducts() {
		
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		
		//create a query
		Query<Product> theQuery = 
				currentSession.createQuery("from Product", Product.class);
		
		//execute query and get the list
		List<Product> products = theQuery.getResultList();
		
		//return the result
		return products;
	}

}
