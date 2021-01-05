package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class PointTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test 
	public void testDefaultConstructor() {
		Point g = new Point();
		Assert.assertNotNull(g.getCoordinate());
		Assert.assertEquals(0.0, g.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(0.0, g.getCoordinate().getY(), EPSILON);
	}
	
	@Test 
	public void testGetType() {
		Point g = new Point();
		Assert.assertEquals("Point", g.getType());
	}
	
	@Test
	public void testTranslate() {
		Point g = new Point(new Coordinate(4.0, 5.0));
		g.translate(2.0, 3.0);
		Assert.assertEquals(6.0, g.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(8.0, g.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testIsEmpty() {
		Coordinate c = Mockito.mock(Coordinate.class);
		Mockito.when(c.isEmpty()).thenReturn(true);
		Point g = new Point(c);
		Assert.assertTrue(g.isEmpty());
	}
	
	@Test
	public void testClone() {
		Point g = new Point(new Coordinate(4.0, 5.0));
		Point copy = g.cloneGeom();
		Assert.assertNotSame(g, copy);
		Assert.assertSame(g.getCoordinate(), copy.getCoordinate());
	}
	
		
}
