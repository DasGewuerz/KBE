package de.htwberlin.item_management.impl;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import de.htwberlin.item_management.api.CategoryService;
import de.htwberlin.item_management.api.InvalidNameException;
import de.htwberlin.item_management.api.domain.Category;

/**
 * Unit test for CategoryService.
 */
public class CategoryServiceTest {

	private CategoryService service;

	@BeforeAll
	public static void initialize() {
		// wird vor allen Testfällen ausgeführt
	}

	@BeforeEach
	public void setUp() {
		this.service = new CategoryServiceImpl();
	}

	@Test
	public void testCreateCategoryValidName() throws InvalidNameException {
		// Arrange
		String name = "Computer";
		// Act
		Category c = service.createCategory(name);
		// Assert
		Assertions.assertNotNull(c);
		Assertions.assertEquals(name, c.getName());
	}

	// mit Lambda-Ausdruck
	@Test
	public void testCreateCategoryInvalidName() {
		// Arrange
		String name = "Computer and Tablet";

		// Assert
		Assertions.assertThrows(InvalidNameException.class, () -> {
			// Act
			service.createCategory(name);
		});
	}

	@Test
	public void testCreateCategoryInvalidNameOhneLambda() {
		// Arrange
		String name = "Computer and Tablet";

		// Act
		Executable e = new Executable() {
			public void execute() throws InvalidNameException {
				// Act
				service.createCategory(name);				
			}
		};
		
		// Assert		
		Assertions.assertThrows(InvalidNameException.class, e);
	}

	@Test
	public void testCreateCategoryValidComplexName() throws InvalidNameException {
		// Arrange
		String name = "Computer & Tablet";
		// Act
		Category c = service.createCategory(name);
		// Assert
		Assertions.assertNotNull(c);
		Assertions.assertEquals(name, c.getName());
	}

	@Test
	public void testCreateCategoryInvalidComplexName() {
		// Arrange
		String name = "Computer , Tablet & Zubehör";

		// Assert
		Assertions.assertThrows(InvalidNameException.class, () -> {
			// Act
			service.createCategory(name);
		});
	}

	@Test
	public void testCreateCategoryValidMoreComplexName() throws InvalidNameException {
		// Arrange
		String name = "Computer, Tablet & Zubehör";
		// Act
		Category c = service.createCategory(name);
		// Assert
		Assertions.assertNotNull(c);
		Assertions.assertEquals(name, c.getName());
	}

	@AfterEach
	public void tearDown() {
		// wird nach jedem Testfall ausgeführt
	}

	@AfterAll
	public static void uninitialize() {
		// wird nach allen Testfällen ausgeführt
	}

}
