package demo.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import demo.domain.Holding;

@Component
public class HoldingService {
	
	public HoldingService() {
	}

	public Holding getHolding() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://localhost:8080/holding", Holding.class);
	}

	public Holding[] getHoldings() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://localhost:8080/holdings", Holding[].class);
	}
}
