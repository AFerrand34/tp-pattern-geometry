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
		return this.points.size() == 0;
	}
	
	
	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public void translate(double dx, double dy) {
		for (Point point : points) {
			point.translate(dx, dy);
		}
	}

	@Override
	public LineString cloneGeom() {
		List<Point> newPoints = new ArrayList<>(getNumPoints());
		for (Point point : points) {
			newPoints.add(point.cloneGeom());
		}
		return new LineString(newPoints);
	}

	@Override
	public Envelope getEnvelope() {
		EnvelopeBuilder builder = new EnvelopeBuilder();
		for(int i = 0; i < this.getNumPoints(); i++) {
			builder.insert(this.getPointN(i).getCoordinate());
		}
		return builder.build();
	}


}
