package org.acme.geometry;

import java.util.List;

public class LineString implements Geometry {
	public List<Point> points;
	
	public LineString() {
		
	}
	
	public LineString(List<Point> points) {
		this.points = points;
	}

	public int getNumPoints() {
		return this.points.size();
	}

	public Point getPointN(int n) {
		return this.points.get(n);
	}
	
	
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}


}
