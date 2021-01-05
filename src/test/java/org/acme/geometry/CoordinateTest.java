package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		Coordinate c = new Coordinate();
		Assert.assertTrue(c.isEmpty());
		Assert.assertTrue(Double.isNaN(c.getX()));
		Assert.assertTrue(Double.isNaN(c.getY()));
	}
	
	@Test
	public void testConstructor() {
		Coordinate c = new Coordinate(4.0, 5.0);
		Assert.assertFalse(c.isEmpty());
		Assert.assertEquals(4.0, c.getX(), EPSILON);
		Assert.assertEquals(5.0, c.getY(), EPSILON);
	}
	
	@Test
	public void testConstructorXY() {
		Coordinate c = new Coordinate(4.0, 5.0);
		Assert.assertEquals(4.0, c.getX(), EPSILON);
		Assert.assertEquals(5.0, c.getY(), EPSILON);
	}
}
