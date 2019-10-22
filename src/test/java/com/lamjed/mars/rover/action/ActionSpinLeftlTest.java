package com.lamjed.mars.rover.action;

import org.junit.Assert;
import org.junit.Test;

import com.lamjed.mars.rover.RoverMars;
import com.lamjed.mars.rover.grid.Coordinates;
import com.lamjed.mars.rover.grid.Direction;
import com.lamjed.mars.rover.grid.Plateau;

public class ActionSpinLeftlTest {

	@Test
	public void testSpinRight() {

		Plateau plateau = new Plateau(5, 5);
		Coordinates coordinates = new Coordinates(1, 2);
		RoverMars roverMars = new RoverMars(plateau, coordinates, Direction.N);
		ActionInterface actionImpl = new ActionSpingLeftImpl();
		Assert.assertTrue("1 2 W".equals(actionImpl.execute(roverMars).currentPosition()));

	}

}
