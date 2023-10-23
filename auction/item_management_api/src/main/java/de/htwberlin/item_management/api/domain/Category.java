package de.htwberlin.item_management.api.domain;

import java.util.List;

public class Category {
	
	private Long id;
	private String name;
	
	private List<Item> items;

	private List<Category> subcategories;
	private Category maincategory;

	
	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
