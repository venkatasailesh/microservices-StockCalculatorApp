package com.sailesh.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sailesh.client.Stockclient;

@RestController
@RequestMapping("/api/calc")
public class StockCalculationRestController {

	@Autowired
	private Stockclient client;
	
	@GetMapping("/calculate/{companyName}/{quantity}")
	public ResponseEntity<?> calculate(@PathVariable String companyName , @PathVariable Integer quantity){
		
		ResponseEntity<?> responseEntity = null;
		Double totalprice = null;
		try {
			responseEntity =client.getStockprice(companyName);
			System.out.println(responseEntity);
			int statuscode =responseEntity.getStatusCode().value();
			if(statuscode==200) {
				Double companyStockprice = (Double) responseEntity.getBody();
				totalprice = quantity*companyStockprice;
				String response = "Totalcost : " +totalprice;
				responseEntity = new ResponseEntity<String>(response,HttpStatus.OK);
				
			}
			
			
		}catch(Exception e) {
			responseEntity = new ResponseEntity<String>("company not found",HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}
}
