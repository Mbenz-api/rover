package com.lamjed.mars.rover.grid;

import com.lamjed.mars.rover.exception.InvalidCoordinatesException;

public class Coordinates {
	private int xCoordinate;
	private int yCoordinate;

	public Coordinates(final int xCooridnate, final int yCoordinate) {
		this.xCoordinate = xCooridnate;
		this.yCoordinate = yCoordinate;
	}

	public int getxCooridnate() {
		return xCoordinate;
	}

	public void setxCooridnate(int xCooridnate) {
		this.xCoordinate = xCooridnate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public Coordinates newCoordinates(final int xCoordinateCommand, final int yCoordinateCommand) {
		return new Coordinates(this.xCoordinate + xCoordinateCommand, this.yCoordinate + yCoordinateCommand);
	}

	public Coordinates newCoordinatesAfterForward(final int xCoordinateCommand, final int yCoordinateCommand) {
		return new Coordinates(xCoordinate + xCoordinateCommand, yCoordinate + yCoordinateCommand);
	}

	/**
	 * this aims to check whether cooridnates are inside or not
	 * 
	 * @param coordinates
	 * @param topRightCoordinate
	 * @return
	 */
	public static boolean isValidCoordinates(Coordinates coordinates, Coordinates topRightCoordinate) {
		// x coordinates and y coordinate
		if (coordinates == null || topRightCoordinate == null)
			throw new InvalidCoordinatesException("The coordinates could not be null");
		return coordinates.xCoordinate <= topRightCoordinate.xCoordinate && coordinates.xCoordinate >= 0
				&& coordinates.yCoordinate <= topRightCoordinate.yCoordinate && coordinates.yCoordinate >= 0;
	}

	@Override
	public String toString() {
		StringBuilder coordinate = new StringBuilder();
		coordinate.append(xCoordinate);
		coordinate.append(" ");
		coordinate.append(yCoordinate);
		return coordinate.toString();
	}

	public static boolean isEligibleForward(Coordinates coordinates, Coordinates topRightCoordinate) {
		return false;
	}

}
