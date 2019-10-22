package com.lamjed.mars.rover.grid;

/**
 * 
 * @author Lenovo
 *
 */
public enum Direction {
	// North
	N {
		@Override
		public Direction right() {
			// TODO Auto-generated method stub
			return E;
		}

		@Override
		public Direction left() {
			// TODO Auto-generated method stub
			return W;
		}
	},
	// South
	S {

		@Override
		public Direction right() {
			// TODO Auto-generated method stub
			return W;
		}

		@Override
		public Direction left() {
			// TODO Auto-generated method stub
			return E;
		}

	},
	// East
	E {

		@Override
		public Direction right() {
			// TODO Auto-generated method stub
			return S;
		}

		@Override
		public Direction left() {
			// TODO Auto-generated method stub
			return N;
		}

	},
	// west
	W {

		@Override
		public Direction right() {
			// TODO Auto-generated method stub
			return N;
		}

		@Override
		public Direction left() {
			// TODO Auto-generated method stub
			return S;
		}

	};

	// abstract method to represent the 90 degrees direction change
	public abstract Direction right();

	// abstract method to represent the 90 degrees direction change
	public abstract Direction left();

}
