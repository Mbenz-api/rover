package com.lamjed.mars.rover;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import com.lamjed.mars.rover.grid.Coordinates;
import com.lamjed.mars.rover.grid.Direction;
import com.lamjed.mars.rover.grid.Plateau;

/**
 * 
 * @author Lenovo
 *
 */
public class RoverMain {
	private final static String INPUT_SPLITTER = " ";

	public static void main(String[] args) {
//input file params
		String filePath = args[0];
		;// "C:\\Users\\Lenovo\\Desktop"; // args[0];
		FileInputStream fstream;
		String strLine;
		try {
			fstream = new FileInputStream(filePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			Plateau plateau = null;
			Coordinates currentCoordinates = null;
			Coordinates currentCoordinates2 = null;
			String action = "";
			String direction = "";
			String direction2 = "";
			// read line by line
			if (br != null) {

				strLine = br.readLine();// Top coordinates
				String[] stringArray = strLine.split(INPUT_SPLITTER);
				if (stringArray != null && stringArray.length >= 2) {
					Integer xTop = Integer.valueOf(stringArray[0]);
					Integer yTop = Integer.valueOf(stringArray[1]);
					// initializing Top
					plateau = new Plateau(xTop, yTop);
				}

				strLine = br.readLine();// current Location
				stringArray = strLine.split(INPUT_SPLITTER);

				if (stringArray != null && stringArray.length >= 2) {
					Integer xCoordinate = Integer.valueOf(stringArray[0]);
					Integer yCoordinate = Integer.valueOf(stringArray[1]);
					direction = stringArray[2];
					currentCoordinates = new Coordinates(xCoordinate, yCoordinate);
				}

				action = br.readLine();// Action1
				RoverMars roverMars = new RoverMars(plateau, currentCoordinates, Direction.valueOf(direction));
				roverMars.run(action);
				System.out.println(roverMars.currentPosition());

				// ROVERS 2

				strLine = br.readLine();// current Location
				stringArray = strLine.split(INPUT_SPLITTER);

				if (stringArray != null && stringArray.length >= 2) {
					Integer xCoordinate = Integer.valueOf(stringArray[0]);
					Integer yCoordinate = Integer.valueOf(stringArray[1]);
					direction2 = stringArray[2];
					currentCoordinates2 = new Coordinates(xCoordinate, yCoordinate);
				}

				action = br.readLine();// Action1
				RoverMars roverMars2 = new RoverMars(plateau, currentCoordinates2, Direction.valueOf(direction2));
				roverMars2.run(action);
				System.out.println(roverMars2.currentPosition());

				br.close();
			}
		} catch (FileNotFoundException fe) {
			System.out.println("ERROR occured while loading input file :" + fe.getMessage());
		} catch (IOException e) {
			System.out.println("ERROR occured while loading input file" + e.getMessage());
		}

	}

}
