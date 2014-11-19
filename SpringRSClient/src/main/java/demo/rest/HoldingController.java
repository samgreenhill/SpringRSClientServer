package demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.Holding;
import demo.service.HoldingService;

@RestController
public class HoldingController {
	
	@Autowired
	private HoldingService service;

	public HoldingController() {
		
	}
	
	@RequestMapping("/holding")
	public Holding getHolding() {
		return service.getHolding();
	}
	
	@RequestMapping("/holdings")
	public Holding[] getHoldings() {
		return service.getHoldings();
	}
}
