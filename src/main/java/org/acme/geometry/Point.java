package org.acme.geometry;

public class Point implements Geometry{
	
	public static final String TYPE = "Point";
	
	private Coordinate coordinate;
	
	public Point() {
		this.coordinate = new Coordinate();
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

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void translate(double dx, double dy) {
		this.coordinate = new Coordinate(this.coordinate.getX()+dx, this.coordinate.getY()+dy);		
	}

	@Override
	public Point cloneGeom() {
		return new Point(coordinate);
	}

}

	