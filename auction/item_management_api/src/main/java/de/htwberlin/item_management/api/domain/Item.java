package de.htwberlin.item_management.api.domain;

import java.util.List;

public class Item {

	private Long id;
	private String name;
	private String description;
	private MonetaryAmount initialPrice;
	
	private List<Category> categories;

	public Item(Long id, String name, String description, MonetaryAmount initialPrice) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.initialPrice = initialPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MonetaryAmount getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(MonetaryAmount initialPrice) {
		this.initialPrice = initialPrice;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

}
