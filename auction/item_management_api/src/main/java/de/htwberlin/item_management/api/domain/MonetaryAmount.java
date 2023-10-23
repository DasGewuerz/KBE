package de.htwberlin.item_management.api.domain;

import java.math.BigDecimal;

public class MonetaryAmount {

	private BigDecimal value;
	private String currency;
	
	public MonetaryAmount(BigDecimal value, String currency) {
		super();
		this.value = value;
		this.currency = currency;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
