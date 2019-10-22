package com.lamjed.mars.rover.grid;

import org.junit.Assert;
import org.junit.Test;

import com.lamjed.mars.rover.exception.InvalidCoordinatesException;

public class CoordinatesTest {

	@Test
	public void testValidCoordinates() {// test if coordinates given are valid (inside the rectangle)
		// coordiates
		Coordinates topRihtCoordinates = new Coordinates(5, 4);
		// coordinates given
		Coordinates coordinates = new Coordinates(1, 1);
		// test if those coordinates are inside and valid
		Assert.assertTrue(Coordinates.isValidCoordinates(coordinates, topRihtCoordinates));

		// coordinates given
		Coordinates coordinates2 = new Coordinates(0, 1);
		Coordinates newCoordinates = coordinates2.newCoordinates(3, 2);
		// test if those coordinates are inside and valid
		Assert.assertTrue(Coordinates.isValidCoordinates(newCoordinates, topRihtCoordinates));

	}

	@Test(expected = InvalidCoordinatesException.class)
	public void testNullCoordinates() {
		Coordinates topRihtCoordinates = new Coordinates(5, 4);
		Assert.assertTrue(Coordinates.isValidCoordinates(topRihtCoordinates, null));

		Assert.assertTrue(Coordinates.isValidCoordinates(null, topRihtCoordinates));

		Assert.assertTrue(Coordinates.isValidCoordinates(null, null));
	}

}
