package org.acme.geometry;

public class Coordinate {
	private double x = 0.0;
	private double y = 0.0;
	
	public Coordinate() {
	}
	
	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	
	public boolean isEmpty() {
		return Double.isNaN(x) || Double.isNaN(y);
	}

}
