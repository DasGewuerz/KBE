package de.htwberlin.item_management.impl;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.htwberlin.item_management.api.CategoryService;
import de.htwberlin.item_management.api.InvalidNameException;
import de.htwberlin.item_management.api.domain.Category;

/**
 * Unit test for CategoryService.
 */
public class CategoryServiceParamTest {

	private CategoryService service;

	@BeforeEach
	public void setUp() {
		this.service = new CategoryServiceImpl();
	}

	public static Stream<Arguments> validData() {
		return Stream.of(Arguments.of("Computer", new Category(1L, "Computer")),
				Arguments.of("Computer & Tablet", new Category(1L, "Computer & Tablet")),
				Arguments.of("Computer, Tablet & Zubehör", new Category(1L, "Computer, Tablet & Zubehör")));

	}

	public static Stream<Arguments> invalidData() {
		return Stream.of(Arguments.of("Computer und Tablet"), Arguments.of("Computer , Tablet & Zubehör"));

	}

	@ParameterizedTest
	@MethodSource("validData")
	public void testCreateCategoryValidName(String name, Category expected) throws InvalidNameException {
		// Arrange
		// Act
		Category c = service.createCategory(name);
		// Assert
		Assertions.assertNotNull(c);
		Assertions.assertEquals(expected.getName(), c.getName());
	}

	@ParameterizedTest
	@MethodSource("invalidData")
	public void testCreateCategoryInvalidName(String name) {
		// Arrange
		// String name = "Computer and Tablet";

		// Assert
		Assertions.assertThrows(InvalidNameException.class, () -> {
			// Act
			service.createCategory(name);
		});
	}

}
