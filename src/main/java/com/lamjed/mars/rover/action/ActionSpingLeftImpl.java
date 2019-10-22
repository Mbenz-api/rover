package com.lamjed.mars.rover.action;

import com.lamjed.mars.rover.RoverMars;

/**
 * The
 * 
 * @author Lenovo
 *
 */
public class ActionSpingLeftImpl implements ActionInterface {
	/**
	 * Step forward
	 */
	public RoverMars execute(RoverMars rover) {
		rover.spinLeft();
		return rover;
	}

}
