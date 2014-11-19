package demo.domain;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Holding {
	
	private static final Random rand = new Random();

	private Fund fund;
	private long units;
	private BigDecimal price;
	private Date priceDate;
	
	public Holding() {
		this.fund = new Fund(RandomStringUtils.randomAlphabetic(4).toUpperCase(), RandomStringUtils.randomAlphabetic(20));
		units = rand.nextInt(1000);
		price = BigDecimal.valueOf(rand.nextDouble() * 2);
		priceDate = Calendar.getInstance().getTime();
	}

	public Fund getFund() {
		return fund;
	}

	public void setFund(Fund fund) {
		this.fund = fund;
	}

	public long getUnits() {
		return units;
	}

	public void setUnits(long units) {
		this.units = units;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getPriceDate() {
		return priceDate;
	}

	public void setPriceDate(Date priceDate) {
		this.priceDate = priceDate;
	}

	public BigDecimal getValuation() {
		return price.multiply(BigDecimal.valueOf(units));
	}
}
