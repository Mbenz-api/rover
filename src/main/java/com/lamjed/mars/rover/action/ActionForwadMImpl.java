package com.lamjed.mars.rover.action;

import com.lamjed.mars.rover.RoverMars;

/**
 * The
 * 
 * @author Lenovo
 *
 */
public class ActionForwadMImpl implements ActionInterface {
	/**
	 * Step forward
	 */
	public RoverMars execute(RoverMars rover) {
		rover.stepForward();
		return rover;
	}

}
