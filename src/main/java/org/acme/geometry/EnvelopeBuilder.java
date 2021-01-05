package org.acme.geometry;

public class EnvelopeBuilder  {
	private Envelope boundingBox;
	
	
	public EnvelopeBuilder() {
		this.boundingBox = new Envelope();
	}
	
	public void insert(Coordinate coordinate) {
		assert(coordinate != null);
		if(this.boundingBox.isEmpty()) {
			this.boundingBox = new Envelope(coordinate, coordinate);
		}else {
			if(coordinate.getX() < this.boundingBox.getXmin() && coordinate.getY() < this.boundingBox.getYmin()) {
				this.boundingBox = new Envelope(coordinate, new Coordinate(this.boundingBox.getXmax(), this.boundingBox.getYmax()));
			}
			if(coordinate.getX() < this.boundingBox.getXmin() && coordinate.getY() > this.boundingBox.getYmin()) {
				this.boundingBox = new Envelope(new Coordinate(coordinate.getX(), this.boundingBox.getYmin()), new Coordinate(this.boundingBox.getXmax(), this.boundingBox.getYmax()));
			}
			if(coordinate.getX() > this.boundingBox.getXmin() && coordinate.getY() < this.boundingBox.getYmin()) {
				this.boundingBox = new Envelope(new Coordinate(this.boundingBox.getXmin(), coordinate.getY()), new Coordinate(this.boundingBox.getXmax(), this.boundingBox.getYmax()));
			}
			
			if(coordinate.getX() > this.boundingBox.getXmax() && coordinate.getY() > this.boundingBox.getYmax()) {
				this.boundingBox = new Envelope(new Coordinate(this.boundingBox.getXmin(), this.boundingBox.getYmin()), coordinate);
			}
			if(coordinate.getX() > this.boundingBox.getXmax() && coordinate.getY() < this.boundingBox.getYmax()) {
				this.boundingBox = new Envelope(new Coordinate(this.boundingBox.getXmin(), this.boundingBox.getYmin()), new Coordinate(coordinate.getX(), this.boundingBox.getYmax()));
			}
			if(coordinate.getX() < this.boundingBox.getXmax() && coordinate.getY() > this.boundingBox.getYmax()) {
				this.boundingBox = new Envelope(new Coordinate(this.boundingBox.getXmin(), this.boundingBox.getYmin()), new Coordinate(this.boundingBox.getXmax(), coordinate.getY()));
			}
		}
	}
	
	public Envelope build() {
		return this.boundingBox;
	}

}