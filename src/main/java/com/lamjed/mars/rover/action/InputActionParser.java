package com.lamjed.mars.rover.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lamjed.mars.rover.exception.InvalidActionCommand;

/**
 * 
 * @author Lenovo
 *
 */
public class InputActionParser {

	private String action;
	private final String SPLITTER = "";

	private static Map<String, ActionInterface> stringToCommandMap = new HashMap<String, ActionInterface>() {
		{
			put("L", new ActionSpingLeftImpl());
			put("R", new ActionSpingRightImpl());
			put("M", new ActionForwadMImpl());
		}
	};

	/**
	 * 
	 * @param action
	 */
	public InputActionParser(String action) {
		this.action = action;
	}

	/**
	 * 
	 * @return
	 */
	public List<ActionInterface> getListOfActions() {
		List<ActionInterface> actionList = new ArrayList<ActionInterface>();
		// throw an exception when the action command does not match the pattern
		if (!action.isEmpty() && action != null) {
			if (!actionMatchesPattern())
				throw new InvalidActionCommand(
						"Action list must contain only a sequence of the following caracters L,M,R");
			fillArrayWithActions(actionList);
		}
		return actionList;

	}

	/**
	 * 
	 * @return
	 */
	public boolean actionMatchesPattern() {
		return action.matches("[MLR]+");

	}

	/**
	 * 
	 * @param arrayActions
	 * @return
	 */
	public List<ActionInterface> fillArrayWithActions(List<ActionInterface> arrayActions) {
		String[] arrayOfChars = action.split(SPLITTER);
		for (String act : arrayOfChars) {
			arrayActions.add(stringToCommandMap.get(act));
		}
		return arrayActions;
	}

}
