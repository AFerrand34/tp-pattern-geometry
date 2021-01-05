package org.acme.geometry;

public class GeometryWithCachedEnvelope implements Geometry{
	private Geometry original;
	private Envelope cachedBoundingBox;

	public GeometryWithCachedEnvelope(Geometry original) {
		this.original = original;
	}

	@Override
	public String getType() {
		return this.original.getType();
	}

	@Override
	public boolean isEmpty() {
		return this.original.isEmpty();
	}

	@Override
	public void translate(double dx, double dy) {
		this.original.translate(dx, dy);

	}

	@Override
	public Envelope getEnvelope() {
		if(this.cachedBoundingBox == null) {
			this.cachedBoundingBox = this.original.getEnvelope();
		}
		return this.cachedBoundingBox;
	}

	@Override
	public void accept(GeometryVisitor visitor) {
		this.original.accept(visitor);

	}

	@Override
	public Geometry cloneGeom() {
		return this.original.cloneGeom();
	}
}