package com.sailesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sailesh.entity.Stockprice;

public interface StockRepo extends JpaRepository<Stockprice, Integer> {

	public Stockprice findByCompanyName(String companyName);
}
