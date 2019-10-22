package com.lamjed.mars.rover;

import java.util.List;

import com.lamjed.mars.rover.action.ActionInterface;
import com.lamjed.mars.rover.action.InputActionParser;
import com.lamjed.mars.rover.grid.Coordinates;
import com.lamjed.mars.rover.grid.Direction;
import com.lamjed.mars.rover.grid.Plateau;

/**
 * Hello world!
 *
 */
public class RoverMars {
	// Plateau
	private Plateau plateau;

	// coordinates of our Rover
	private Coordinates coordinates;

	// Direction of our Rover
	private Direction direction;

	public RoverMars(final Plateau plateau, final Coordinates coordinates, final Direction direction) {
		this.plateau = plateau;
		this.coordinates = coordinates;
		this.direction = direction;
	}

	public String currentPosition() {
		return this.coordinates.toString() + " " + this.direction.toString();
	}

	public void run(final String commandAtion) {
		List<ActionInterface> roverActions = new InputActionParser(commandAtion).getListOfActions();
		for (ActionInterface action : roverActions) {
			action.execute(this);
		}
	}

	/**
	 * This method aims to step forward 1 step inh the grid
	 */
	public void stepForward() {
		// case NORTH
		if (Direction.N.toString().equals(this.direction.toString())) {
			// test if still afterforward the target coordinates are ok or not to avoid
			// going off grid
			if (this.plateau.isCoordinatesInsideRectangle(this.coordinates.newCoordinatesAfterForward(0, 1))) {
				this.coordinates = this.coordinates.newCoordinates(0, 1);
			}
		}
		// case South
		else if (Direction.S.toString().equals(this.direction.toString())) {
			if (this.plateau.isCoordinatesInsideRectangle(this.coordinates.newCoordinatesAfterForward(0, -1))) {
				this.coordinates = this.coordinates.newCoordinates(0, -1);
			}
		}
		// case East
		else if (Direction.E.toString().equals(this.direction.toString())) {
			if (this.plateau.isCoordinatesInsideRectangle(this.coordinates.newCoordinatesAfterForward(1, 0))) {
				this.coordinates = this.coordinates.newCoordinates(1, 0);
			}
		}
		// Case West
		else if (Direction.W.toString().equals(this.direction.toString())) {
			if (this.plateau.isCoordinatesInsideRectangle(this.coordinates.newCoordinatesAfterForward(-1, 0))) {
				this.coordinates = this.coordinates.newCoordinates(-1, 0);
			}
		}
	}

	/**
	 * this method aims to upadte the direction after the spin right
	 */
	public void spinRight() {
		this.direction = this.direction.right();
	}

	/**
	 * this method aims to update the direction after the spin left
	 */
	public void spinLeft() {
		this.direction = this.direction.left();
	}

}
