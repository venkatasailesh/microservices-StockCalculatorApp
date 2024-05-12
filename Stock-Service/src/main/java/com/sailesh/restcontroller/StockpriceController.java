package com.sailesh.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sailesh.service.StockpriceService;

@RestController
@RequestMapping("/api/price")
public class StockpriceController {

	@Autowired
	private StockpriceService service;
	
	@GetMapping("/stockPrice/{CompanyName}")
	public ResponseEntity<Double> getStockprice(@PathVariable String CompanyName){
		Double price=service.findByCompanyName(CompanyName);
		System.out.println(CompanyName +" "+ price);
		return new ResponseEntity<Double>(price,HttpStatus.OK);
	}
}
