package com.myapp.spring.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@Document(collection="products")
@ToString
@TupleConstructor(force=true)
@EqualsAndHashCode

class Product {
	
	@Id
	String id;
   
	String productName;
   
	Double  price;
   
	Double starRating;
   
	Integer productId;
   
	String  productCode;
   
	String productAvailable;
   
	String imageUrl;
}
