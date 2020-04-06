package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);
		switch(input) {
		case 0:
			System.out.println("Sundays suck because they are foreshadowing for Mondays");
		break;
		case 1:
			System.out.println("I hate Mondays");
		break;
		case 2:
			System.out.println("Tuesdays are the most boring day ever");
		break;
		case 3:
			System.out.println("There's a light at the end of the tunnel");
		break;
		case 4:
			System.out.println("So close to Friday but not yet");
		break;
		case 5:
			System.out.println("Cake time");
		break;
		case 6:
			System.out.println("Only chance for a break");
		break;
		default:
			System.out.println("Didn't pick? Lame.");
			break;
		
		
		}
		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
	}
}
