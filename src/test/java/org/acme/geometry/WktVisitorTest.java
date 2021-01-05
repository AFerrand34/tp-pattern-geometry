package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class WktVisitorTest {

	@Test
	public void testVisitPoint() {
		//WktVisitor visitor = new WktVisitor();
		AbstractGeometry g = new Point(new Coordinate(3.0,4.0));
		//g.accept(visitor);
		Assert.assertEquals("POINT(3.0 4.0)", g.asText());
	}
	
	@Test
	public void testWriteLineString() {
		//WktVisitor visitor = new WktVisitor();
		AbstractGeometry g = SampleFactory.createLineStringOA();
		//g.accept(visitor);
		Assert.assertEquals("LINESTRING(0.0 0.0,4.0 5.0)", g.asText());
	}
	
	@Test
	public void testVisitEmptyPoint() {
		//WktVisitor visitor = new WktVisitor();
		AbstractGeometry g = new Point();
		//g.accept(visitor);
		Assert.assertEquals("POINT EMPTY", g.asText());
	}
	
	@Test
	public void testWriteEmptyLineString() {
		//WktVisitor visitor = new WktVisitor();
		AbstractGeometry g = new LineString();
		//g.accept(visitor);
		Assert.assertEquals("LINESTRING EMPTY", g.asText());
	}
	
}