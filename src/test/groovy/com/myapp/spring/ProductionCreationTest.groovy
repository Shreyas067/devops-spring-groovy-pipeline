package com.myapp.spring
import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.MockMvc

import com.fasterxml.jackson.databind.ObjectMapper
import com.myapp.spring.domain.Product
import com.myapp.spring.service.ProductService

class ProductionCreationTest {

	@Autowired
	
	   MockMvc mvc
	
	
	
	
	   @SpringBean
	
	ProductService productService=Mock()
	
	
	
	
	@Autowired
	
	ObjectMapper objectMapper
	
	
	
	
	def "should pass product save details to domain component and return 'ok' status"() {
	
	given:
	
	Product request = new Product(
	
	productId : 4,
	
	productName : 'SamsungGalaxyNote',
	
	description : 'SamsungGalaxyNote12',
	
				   price: 78546.5,
	
				   starRating: 4.2
	
	)
	
	
	
	
	and:
	
	productService.saveProduct(request)
	
		   
	
		   when:
	
		   def response = mvc.perform(
	
				   post('/products').contentType(APPLICATION_JSON).content(toJson(request))
	
		   ).andReturn().response // notice the extra call to: andReturn()
	
	
	
	
		   then:
	
		   response.status == HttpStatus.OK.value()
	}

}
