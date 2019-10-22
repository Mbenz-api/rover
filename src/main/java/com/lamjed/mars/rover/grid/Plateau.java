package com.lamjed.mars.rover.grid;

public class Plateau {
	private Coordinates topRightCoordinate = new Coordinates(0, 0);
	private Coordinates bottomLeftCoordinate = new Coordinates(0, 0);

	public Plateau(final int topRightX, final int topRightY) {
		this.topRightCoordinate = topRightCoordinate.newCoordinates(topRightX, topRightY);
	}

	public boolean isCoordinatesInsideRectangle(final Coordinates coordinates) {
		// TODO Auto-generated method stub
		return Coordinates.isValidCoordinates(this.bottomLeftCoordinate, coordinates)
				&& Coordinates.isValidCoordinates(coordinates, this.topRightCoordinate);
	}

}
