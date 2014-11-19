package demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.Holding;

@RestController
public class HoldingController {

	public HoldingController() {
		
	}
	
	@RequestMapping("/holding")
	public Holding getHolding() {
		return new Holding();
	}
	
	@RequestMapping("/holdings")
	public Holding[] getHoldings() {
		List<Holding> holdings = new ArrayList<>();
		for(int i=0; i<10; i++) {
			holdings.add(new Holding());
		}
		return holdings.toArray(new Holding[holdings.size()]);
	}
}
