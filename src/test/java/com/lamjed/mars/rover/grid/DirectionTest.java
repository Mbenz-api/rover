package com.lamjed.mars.rover.grid;

import org.junit.Test;

import junit.framework.Assert;

/**
 * This class aims to test the direction
 * 
 * @author Lenovo
 *
 */
public class DirectionTest {
	@Test
	public void westOnRightNorth() {
		Direction north = Direction.N;
		Direction west = Direction.W;
		Assert.assertEquals(west, north.left());

	}

	@Test
	public void eastOnRightNorth() {
		Direction north = Direction.N;
		Direction east = Direction.E;
		Assert.assertEquals(east, north.right());
	}

	@Test
	public void eastOnLeftSouth() {
		Direction south = Direction.S;
		Direction east = Direction.E;
		Assert.assertEquals(east, south.left());
	}
	
	@Test
	public void westOnRighttSouth() {
		Direction south = Direction.S;
		Direction west = Direction.W;
		Assert.assertEquals(west, south.right());
	}
	
	
	@Test
	public void northOnLeftEast() {
		Direction east = Direction.E;
		Direction north = Direction.N;
		Assert.assertEquals(north, east.left());
	}

	
	@Test
	public void northOnRightWest() {
		Direction west = Direction.W;
		Direction north = Direction.N;
		Assert.assertEquals(north, west.right());
	}
	

	@Test
	public void southOnRightEast() {
		Direction east = Direction.E;
		Direction south = Direction.S;
		Assert.assertEquals(south, east.right());
	}
	
	@Test
	public void southOnLeftWest() {
		Direction west = Direction.W;
		Direction south = Direction.S;
		Assert.assertEquals(south, west.left());
	}
}
