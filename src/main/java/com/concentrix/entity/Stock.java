package com.concentrix.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.concentrix.service.stockDAO;


@Entity
@Table(name = "stocks")
public class Stock {
	
	
	@Id
	Integer id;
	private String companyName;
	private int sharePrice;
	
	
	public Integer getId() {
		return id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public Stock(Integer id,String companyName, int sharePrice) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.sharePrice = sharePrice;
	}
	public Stock() {
		super();
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
