package de.htwberlin.item_management.impl;

import de.htwberlin.item_management.api.CategoryService;
import de.htwberlin.item_management.api.InvalidNameException;
import de.htwberlin.item_management.api.domain.Category;

public class CategoryServiceImpl implements CategoryService {

	@Override
	public Category createCategory(String name) throws InvalidNameException {

		if (!validName(name)) {
			throw new InvalidNameException("Name not valid!");
		}

		return new Category(1L, name);
	}

	private boolean validName(String name) {
		if (name.contains(", ")) {
			String pre = name.substring(0, name.indexOf(", "));
			String post = name.substring(name.indexOf(", ") + 2);
			return validName(pre) && validName(post);
		} else if (name.contains(" & ")) {
			String pre = name.substring(0, name.indexOf(" & "));
			String post = name.substring(name.indexOf(" & ") + 3);
			return validName(pre) && validName(post);
		} else {
			return !name.contains(" ");
		}
	}

}
