package org.acme.geometry;

import java.io.PrintStream;

public class LogGeometryVisitor implements GeometryVisitor{
	private PrintStream out;
	
	
	public LogGeometryVisitor(PrintStream out) {
		this.out = out;
	}
	
	public void visit(Point point) {
		this.out.print("I am a "+point.getType()+" with x="+
				Double.toString(point.getCoordinate().getX())+" and y="+
				Double.toString(point.getCoordinate().getY()));
	}
	
	public void visit(LineString lineString) {
		this.out.print("I am a "+lineString.getType()+" and I am defined by "+
				Integer.toString(lineString.getNumPoints())+" point(s)");
	}
}