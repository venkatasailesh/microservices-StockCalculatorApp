package com.sailesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sailesh.entity.Stockprice;
import com.sailesh.exception.StockNotFoundException;
import com.sailesh.repository.StockRepo;


@Service
public class StockpriceServiceImpl implements StockpriceService {

	@Autowired
	private StockRepo repo;
	
	@Override
	public Double findByCompanyName(String companyName) {
		Stockprice stockprice= repo.findByCompanyName(companyName);
		if(stockprice==null) {
			throw new StockNotFoundException("company name not valid");
		}
		return stockprice.getCompanyPrice();
	}

}
