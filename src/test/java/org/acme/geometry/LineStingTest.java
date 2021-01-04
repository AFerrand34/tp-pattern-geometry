package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class LineStingTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test 
	public void testDefaultCOnstructor() {
		Coordinate c = new Coordinate();
		Assert.assertEquals(0.0, c.getX(), EPSILON);
		Assert.assertEquals(0.0, c.getX(), EPSILON);
	}
	
	@Test
	public void testGetType() {
		LineString g = new LineString();
		Assert.assertEquals("LineString", g.getType());
	}
	
	@Test
	public void testisEmpty() {
		LineString g = new LineString();
		Assert.assertEquals(true, g.isEmpty());
	}
	
	@Test
	public void testGetNumPoints() {
		LineString oa = SampleFactory.createLineStringOA();
		Assert.assertEquals(2, oa.getNumPoints());
	}
	
	@Test
	public void testGetPointN() {
		LineString oa = SampleFactory.createLineStringOA();
		Assert.assertEquals(4.0, oa.getPointN(1).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(5.0, oa.getPointN(1).getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testConstructorNullList() {
		boolean thrown = false;
		try {
			LineString g = new LineString(null);	
		} catch (AssertionError e) {
			thrown = true;
		}
		Assert.assertTrue("Assertion attendue sur liste nulle",thrown);
	}

}
