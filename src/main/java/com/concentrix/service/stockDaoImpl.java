package com.concentrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.concentrix.repository.StockRepository;

@Repository
@Service
public class stockDaoImpl implements stockDAO {
	
	@Autowired
	public StockRepository stockRepository;

	@Override
	public Integer generateId() {
		Integer id = stockRepository.findMaxStockId();
		if(id == null) {
			id = 101;
		}
		else
			id = id + 1;
		return id;
		
	}

}
