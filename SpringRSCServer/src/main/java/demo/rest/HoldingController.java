package demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value="/holdings", method = RequestMethod.GET)
	public Holding[] getHoldings() {
		return createHoldings(10);
	}
	
	@RequestMapping(value="/holdings/{number}", method = RequestMethod.GET)
	public Holding[] getHoldings1(@PathVariable(value="number") int number) {
		return createHoldings(number);
	}
	
	@RequestMapping(value="/holdings2", method = RequestMethod.GET)
	public Holding[] getHoldings2(@RequestParam(value="number", defaultValue="10") int number) {
		return createHoldings(number);
	}
	
	@RequestMapping(value="/holdings", method = RequestMethod.POST)
	public Holding[] postHoldings(@RequestParam(value="number", defaultValue="10") int number) {
		return createHoldings(number);
	}
	
	private Holding[] createHoldings(int number) {
		List<Holding> holdings = new ArrayList<>();
		for(int i=0; i<number; i++) {
			holdings.add(new Holding());
		}
		return holdings.toArray(new Holding[holdings.size()]);
	}
}
