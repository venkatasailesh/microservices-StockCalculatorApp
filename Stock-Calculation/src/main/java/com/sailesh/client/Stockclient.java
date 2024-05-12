package com.sailesh.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="STOCK-PRICE-SERVICE")
public interface Stockclient {
	
	@GetMapping("/api/price/stockPrice/{CompanyName}")
	public ResponseEntity<Double> getStockprice(@PathVariable String CompanyName);
}
