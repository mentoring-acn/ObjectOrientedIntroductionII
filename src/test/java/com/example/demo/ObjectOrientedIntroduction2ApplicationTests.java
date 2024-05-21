package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.exercise.Rectangle;
import com.example.demo.exercise.Shape;

@SpringBootTest
class ObjectOrientedIntroduction2ApplicationTests {

	@Test
	void testRectangle() {
		
		Shape rectangle = new Rectangle("Blue", 10.67, 5.98);
		
		Double area = rectangle.calculateArea();
		Double perimeter = rectangle.calculatePerimeter();
		
		assertEquals(area,63.8066);
		assertEquals(perimeter,33.3);
		assertEquals(rectangle.getColor(),"Blue");
	}
	
	@Test
	void testSquare() {
		
		Shape square = new Rectangle("Red", 10.67);
		
		Double area = square.calculateArea();
		Double perimeter = square.calculatePerimeter();
		
		assertEquals(area,113.8489);
		assertEquals(perimeter,42.68);
		assertEquals(square.getColor(),"Red");
	}
	
	@Test
	void testTriangle() {
		
		Shape triangle = new Triangle("Yellow", 4,5,7);
		
		Double area = triangle.calculateArea();
		Double perimeter = triangle.calculatePerimeter();
		
		assertEquals(area, 9.798);
		assertEquals(perimeter, 16);
		assertEquals(triangle.getColor(),"Yellow");
	}
	
	@Test
	void testTriangle2() {
		
		Shape triangle = new Triangle("Orange", 4);
		
		Double area = triangle.calculateArea();
		Double perimeter = triangle.calculatePerimeter();
		
		assertEquals(area, 6.928);
		assertEquals(perimeter, 12);
		assertEquals(triangle.getColor(),"Orange");
	}
	
	@Test
	void testCircle() {
		
		Shape triangle = new Circle("White", 6.3);
		
		Double area = triangle.calculateArea();
		Double perimeter = triangle.calculatePerimeter();
		
		assertEquals(area, 124.6898);
		assertEquals(perimeter, 39.5841);
		assertEquals(triangle.getColor(),"White");
	}

}
