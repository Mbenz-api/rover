package com.lamjed.mars.rover.grid;

import org.junit.Assert;
import org.junit.Test;

public class PlateauTest {

	@Test
	public void isCoordinatesInsideRectangle() {
		// Valid plateau is the plateau with x >0 and Y >0
		Plateau plateau = new Plateau(6, 6);
		Coordinates coordinates = new Coordinates(1, 2);

		Assert.assertTrue(plateau.isCoordinatesInsideRectangle(coordinates));

		Coordinates coordinates02 = new Coordinates(0, 2);
		Assert.assertTrue(plateau.isCoordinatesInsideRectangle(coordinates02));

		Coordinates coordinates00 = new Coordinates(0, 0);
		Assert.assertTrue(plateau.isCoordinatesInsideRectangle(coordinates00));
//
//		Coordinates coordinates0Minus2 = new Coordinates(-1, -2);
//		Assert.assertTrue(plateau.isCoordinatesInsideRectangle(coordinates0Minus2));
	}

}
