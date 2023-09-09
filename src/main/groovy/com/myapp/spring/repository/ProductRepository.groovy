package com.myapp.spring.repository

import org.springframework.data.mongodb.repository.MongoRepository

import com.myapp.spring.domain.Product

interface ProductRepository extends MongoRepository<Product,String>{
}
