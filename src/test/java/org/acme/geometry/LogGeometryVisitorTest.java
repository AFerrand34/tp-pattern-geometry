package org.acme.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class LogGeometryVisitorTest {

	@Test
	public void testVisitLineString() {
		String result = "I am a LineString and I am defined by 2 point(s)"; 
		ByteArrayOutputStream outStr = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(outStr);
		LogGeometryVisitor visitor = new LogGeometryVisitor(out);
		Geometry geometry = SampleFactory.createLineStringOA();
		geometry.accept(visitor);
		Assert.assertEquals(result, outStr.toString());
	}
	
	@Test
	public void testVisitPoint() {
		String result = "I am a Point with x=3.0 and y=4.0";
		ByteArrayOutputStream outStr = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(outStr);
		LogGeometryVisitor visitor = new LogGeometryVisitor(out);
		Geometry geometry = new Point(new Coordinate(3.0,4.0));
		geometry.accept(visitor);
		Assert.assertEquals(result, outStr.toString());
	}
}