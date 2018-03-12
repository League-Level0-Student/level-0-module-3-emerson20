
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String brothersBirthday = "October 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("Who's brithday do you want to know?(example: dad's)");
		// 3. Print out what the user typed
		if (birthday.equals("mom's")) {
			JOptionPane.showMessageDialog(null, "It is on January 24th.");
		}
		 else if (birthday.equals("dad's")) {
			JOptionPane.showMessageDialog(null, "It is on June 9th");
		}
		 else if (birthday.equals("brother's")) {
		    JOptionPane.showMessageDialog(null, "It is on October 16th.");
		}else {
			JOptionPane.showMessageDialog(null, "No comprende! I have no idea what that person's birhtday is!");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
