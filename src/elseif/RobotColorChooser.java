//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Tod;
		Tod = new Robot();
		//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	for (int i = 0; i < 10; i++) {
			
		
		//3. Ask the user what color they would like the robot to draw
		String imp = JOptionPane.showInputDialog("What color would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
 if (imp.equals("blue")) {
	Tod.setPenColor(0,0,255);
}else if (imp.equals("teal")) {
	Tod.setPenColor(0, 128, 128);
}else if (imp.equals("aqua")) {
	Tod.setPenColor(0, 255, 255);
}
else if (imp.equals("royal blue")) {
	Tod.setPenColor(65,105,225);
}
        //6. If the user doesn’t enter anything, choose a random color
 else {
	 Tod.setRandomPenColor();
	 }
        
		
		//4. Set the pen width to 10
		Tod.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
Tod.penDown();
Tod.setSpeed(40);
Tod.move(250);
Tod.turn(-90);
Tod.move(400);
Tod.turn(-90);
Tod.move(250);
Tod.turn(-90);
Tod.move(400);
Tod.turn(-90);
	}
	JOptionPane.showMessageDialog(null, "That was fun! Have a good day!");
	System.exit(0);
	}
}













































