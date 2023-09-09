package com.myapp.spring.service

import com.myapp.spring.domain.Product

interface ProductService {
	
	List<Product> findAll()
	
	Product findById(String productId)
	
	Product saveProduct(Product product)
	
	Product deleteProduct(String productId)
}
//hello 