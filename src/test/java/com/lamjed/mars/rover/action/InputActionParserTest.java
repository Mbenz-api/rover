package com.lamjed.mars.rover.action;

import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

/***
 * 
 * @author Lenovo
 *
 */
public class InputActionParserTest {

	@Test
	public void testGetActionForward() {
		// Given
		InputActionParser inputActionParser = new InputActionParser("M");

		// When
		List<ActionInterface> action = inputActionParser.getListOfActions();

		// THEN
		Assert.assertTrue(ActionForwadMImpl.class.toString().equals(action.get(0).getClass().toString()));

	}

	@Test
	public void testGetActionSpinRight() {
		// Given
		InputActionParser inputActionParser = new InputActionParser("R");

		// When
		List<ActionInterface> action = inputActionParser.getListOfActions();

		// THEN
		Assert.assertTrue(ActionSpingRightImpl.class.toString().equals(action.get(0).getClass().toString()));

	}

	@Test
	public void testGetActionSpinLeft() {
		// Given
		InputActionParser inputActionParser = new InputActionParser("L");

		// When
		List<ActionInterface> action = inputActionParser.getListOfActions();

		// THEN
		Assert.assertTrue(ActionSpingLeftImpl.class.toString().equals(action.get(0).getClass().toString()));

	}

	@Test
	public void testGetMultipleActions() {

		// GIVEN
		InputActionParser inputActionParser = new InputActionParser("RLM");

		// When
		List<ActionInterface> action = inputActionParser.getListOfActions();

		// THEN
		Assert.assertTrue(ActionSpingRightImpl.class.toString().equals(action.get(0).getClass().toString()));
		// THEN
		Assert.assertTrue(ActionSpingLeftImpl.class.toString().equals(action.get(1).getClass().toString()));
		// THEN
		Assert.assertTrue(ActionForwadMImpl.class.toString().equals(action.get(2).getClass().toString()));

	}

	@Test
	public void testActionMatchesPattern() {

		InputActionParser inputActionParserM = new InputActionParser("M");
		Assert.assertTrue(inputActionParserM.actionMatchesPattern());

		InputActionParser inputActionParserR = new InputActionParser("R");
		Assert.assertTrue(inputActionParserR.actionMatchesPattern());

		InputActionParser inputActionParserL = new InputActionParser("L");
		Assert.assertTrue(inputActionParserL.actionMatchesPattern());

		InputActionParser inputActionParser = new InputActionParser("LRMMMRRMM");
		Assert.assertTrue(inputActionParser.actionMatchesPattern());

	}

//	@Test
//	public void testFillArrayWithActions() {
//		InputActionParser inputActionParserM = new InputActionParser("M");
//		Assert.assertTrue(inputActionParserM.actionMatchesPattern());
//	}

}
