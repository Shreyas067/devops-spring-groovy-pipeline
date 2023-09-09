package com.myapp.spring.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import com.myapp.spring.domain.Product
import com.myapp.spring.service.ProductService

@RestController
@RequestMapping("/api/products")


class ProductAPI {
	
	private ProductService ProductService

	public ProductAPI(ProductService ProductService) {
		this.ProductService = ProductService;
	}
	
	@GetMapping
	def getAllProductList(){
		ProductService.findAll()
	}
	
	@PostMapping
	Product saveProduct(@RequestBody Product product){
			ProductService.saveProduct product
	}
	
	@PutMapping('/{productId}')
	Product updateProduct(@PathVariable String productId, @RequestBody Product ProductService){
		ProductService.updateProduct productId, product
	}
	
	@DeleteMapping('/{productId}')
	def deleteProduct(@PathVariable String productId){
		ProductService.deleteProduct productId
	}
	
	@GetMapping('/{productId}')
	Product getProductById(@PathVariable String productId){
		ProductService.findById productId
	}
	
}
