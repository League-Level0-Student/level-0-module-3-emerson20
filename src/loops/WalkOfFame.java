
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setX(199);
		rob.setY(200);
		// 2. Make the robot draw a star shape. Hint: 144.
		rob.setSpeed(100);
		rob.penDown();
		rob.setPenWidth(10);
		rob.setRandomPenColor();
		rob.turn(144);
		rob.move(300);
		rob.turn(144);
		rob.move(300);
		rob.turn(144);
		rob.move(300);
		rob.turn(144);
		rob.move(300);
		rob.turn(144);
		rob.move(300);
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
