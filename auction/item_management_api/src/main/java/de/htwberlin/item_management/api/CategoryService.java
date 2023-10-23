package de.htwberlin.item_management.api;

import de.htwberlin.item_management.api.domain.Category;

public interface CategoryService {
	
	/**
	 * Erzeugt eine Kategory
	 * @param name der neuen Kategorie
	 * @return die neue Category
	 */
	Category createCategory(String name);

	// ...
}