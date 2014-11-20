package demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Holding[] getHoldings(@RequestParam(value="type", defaultValue="GET") String type, @RequestParam(value="number", defaultValue="10") int number) {
		return type.equalsIgnoreCase("GET") ? service.getHoldings() : service.postHoldings();
	}
}
