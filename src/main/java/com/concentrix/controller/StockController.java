package com.concentrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.concentrix.entity.Stock;
import com.concentrix.repository.StockRepository;
import com.concentrix.service.stockDAO;

@RestController
public class StockController {

	@Autowired
	private StockRepository stockRepository;
	
	@Autowired
	private stockDAO stockDao;


	@GetMapping("/stockdata")
	public ModelAndView showStockData() {
		ModelAndView mv = new ModelAndView("stockdata");
		Iterable<Stock> stocks = stockRepository.findAll();
		mv.addObject("stocks", stocks);
		return mv;
	}

	@GetMapping("/add-stock")
	public ModelAndView addStockPage() {
		ModelAndView mv = new ModelAndView("add-stock");
		return mv;
	}

	@GetMapping("/update/{id}")
	public ModelAndView updateStockPage(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("update-stock");
		Stock stock = stockRepository.findById(id).get();
		mv.addObject("stock", stock);
		return mv;
	}

	@PostMapping("/updateStock")
	public ModelAndView updateStock(@ModelAttribute("stock") Stock stock) {
		ModelAndView mv = new ModelAndView("redirect:/stockdata");
		stockRepository.save(stock);
		return mv;
	}

	@GetMapping("/delete/{id}")
	public ModelAndView deleteStock(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("redirect:/stockdata");
		stockRepository.deleteById(id);
		return mv;
	}

	@GetMapping("/addstock")
	public ModelAndView addStock(@RequestParam String companyName, @RequestParam int sharePrice) {
		ModelAndView mv = new ModelAndView("redirect:/stockdata");
		Integer id = stockDao.generateId();
		Stock stock = new Stock(id, companyName, sharePrice);
		stockRepository.save(stock);
		return mv;
	}

}
