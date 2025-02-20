package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;


public class GeometryWithCachedEnvelopeTest {

	@Test
	public void testGetEnvelope() {
		Geometry g = SampleFactory.createPointO();
		g = new GeometryWithCachedEnvelope(g);
		Envelope a = g.getEnvelope();
		Envelope b = g.getEnvelope();
		Assert.assertSame(a, b);
	}

	@Test
	public void testType() {
		Geometry g = SampleFactory.createPointO();
		g = new GeometryWithCachedEnvelope(g);
		Assert.assertEquals("Point", g.getType());
	}

	@Test
	public void testIsEmpty() {
		Geometry g = SampleFactory.createPointA();
		g = new GeometryWithCachedEnvelope(g);
		Assert.assertFalse(g.isEmpty());
	}
	
	@Test
	public void testObserver() {
		Geometry g = SampleFactory.createPointA();
		g = new GeometryWithCachedEnvelope(g);
		Envelope a = g.getEnvelope();
		g.translate(-1.0, 10.0);
		Envelope b = g.getEnvelope();
		Assert.assertNotSame(a, b);
	}
}