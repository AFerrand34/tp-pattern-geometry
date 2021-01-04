package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry {
	
	public static final String TYPE = "LineString";
	
	private List<Point> points;
	
	public LineString() {
		this.points = new ArrayList <>();
	}
	
	public LineString(List<Point> points) {
		assert(points != null);
		this.points = points;
	}

	public int getNumPoints() {
		return this.points.size();
	}

	public Point getPointN(int n) {
		return points.get(n);
	}
	
	public boolean isEmpty() {
		return this.points.isEmpty();
	}
	
	
	@Override
	public String getType() {
		return TYPE;
	}


}
