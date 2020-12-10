package com.example.demo;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogService {
	@RequestMapping("{userid}")
	public List<CatalogItem> getCatalog(@PathVariable("userid") String Userid){
		
		//get all rated movies id
		
		//for each movie id,call movie info service and get details
		
		//put them all together
		return Collections.singletonList(
				new CatalogItem("Transformers","Test",4) 
				);
	}

}
