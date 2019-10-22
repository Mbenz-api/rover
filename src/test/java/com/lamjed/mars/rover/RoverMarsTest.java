package com.lamjed.mars.rover;

import org.junit.Assert;
import org.junit.Test;

import com.lamjed.mars.rover.grid.Coordinates;
import com.lamjed.mars.rover.grid.Direction;
import com.lamjed.mars.rover.grid.Plateau;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class RoverMarsTest extends TestCase {

	@Test
	public void testStepForward() {
//Given
		Plateau plateau = new Plateau(5, 5);
		Coordinates coordinates = new Coordinates(1, 2);
		RoverMars roverMars = new RoverMars(plateau, coordinates, Direction.N);
		roverMars.stepForward();
		Assert.assertTrue("1 3 N".equals(roverMars.currentPosition()));
//		roverMars.stepForward();
//		Assert.assertTrue("1 -1 W".equals(roverMars.currentPosition()));
//		roverMars.stepForward();
//		Assert.assertTrue("1 5 N".equals(roverMars.currentPosition()));
//		roverMars.stepForward();
//		Assert.assertTrue("1 6 N".equals(roverMars.currentPosition()));
	}

	@Test
	public void testSpinRight() {

		Plateau plateau = new Plateau(5, 5);
		Coordinates coordinates = new Coordinates(1, 2);
		RoverMars roverMars = new RoverMars(plateau, coordinates, Direction.N);
		roverMars.spinRight();
		Assert.assertTrue("1 2 E".equals(roverMars.currentPosition()));
		roverMars.spinRight();
		Assert.assertTrue("1 2 S".equals(roverMars.currentPosition()));
		roverMars.spinRight();
		Assert.assertTrue("1 2 W".equals(roverMars.currentPosition()));
		roverMars.spinRight();
		Assert.assertTrue("1 2 N".equals(roverMars.currentPosition()));

	}

	@Test
	public void testSpinLeft() {

		Plateau plateau = new Plateau(5, 5);
		Coordinates coordinates = new Coordinates(1, 2);
		RoverMars roverMars = new RoverMars(plateau, coordinates, Direction.N);
		roverMars.spinLeft();
		Assert.assertTrue("1 2 W".equals(roverMars.currentPosition()));
		roverMars.spinLeft();
		Assert.assertTrue("1 2 S".equals(roverMars.currentPosition()));
		roverMars.spinLeft();
		Assert.assertTrue("1 2 E".equals(roverMars.currentPosition()));
		roverMars.spinLeft();
		Assert.assertTrue("1 2 N".equals(roverMars.currentPosition()));

	}

	@Test
	public void testRUNForwardAction() {
		// GIVEN
		Plateau plateau = new Plateau(5, 5);
		Coordinates startingPosition = new Coordinates(1, 2);
		RoverMars roverMars = new RoverMars(plateau, startingPosition, Direction.N);

		// WHEN
		roverMars.run("M");

		// THEN
		Assert.assertEquals("1 3 N", roverMars.currentPosition());

	}

	@Test
	public void testRUNSpinLeftAction() {
		// GIVEN
		Plateau plateau = new Plateau(5, 5);
		Coordinates startingPosition = new Coordinates(1, 2);
		RoverMars roverMars = new RoverMars(plateau, startingPosition, Direction.N);

		// WHEN
		roverMars.run("L");

		// THEN
		Assert.assertEquals("1 2 W", roverMars.currentPosition());

	}

	@Test
	public void testRUNSpinRightAction() {
		// GIVEN
		Plateau plateau = new Plateau(5, 5);
		Coordinates startingPosition = new Coordinates(1, 2);
		RoverMars roverMars = new RoverMars(plateau, startingPosition, Direction.N);

		// WHEN
		roverMars.run("R");

		// THEN
		Assert.assertEquals("1 2 E", roverMars.currentPosition());

	}

	@Test
	public void testRUNMultipleActions() {
		// GIVEN
		Plateau plateau = new Plateau(5, 5);
		Coordinates startingPosition = new Coordinates(1, 2);
		RoverMars roverMars = new RoverMars(plateau, startingPosition, Direction.N);

		// WHEN
		roverMars.run("LMLMLMLMM");

		// THEN
		Assert.assertEquals("1 3 N", roverMars.currentPosition());

		// GIVEN
		Plateau plateau2 = new Plateau(5, 5);
		Coordinates startingPosition2 = new Coordinates(3, 3);
		RoverMars roverMars2 = new RoverMars(plateau2, startingPosition2, Direction.E);
		// WHEN
		roverMars2.run("MMRMMRMRRM");

		// THEN
		Assert.assertEquals("5 1 E", roverMars2.currentPosition());

	}
}
