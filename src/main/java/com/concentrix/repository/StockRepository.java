package com.concentrix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.concentrix.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
	
	@Query("select max(id) from Stock")
	public Integer findMaxStockId();
	

}
