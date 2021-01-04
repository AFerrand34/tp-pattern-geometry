package org.acme.geometry;

public class Point implements Geometry{
	
	public static final String TYPE = "Point";
	
	private Coordinate coordinate;
	
	public Point() {
	}
	
	public Point(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return TYPE;
	}
}

	