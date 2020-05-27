//Unit Converter written 3/29/2020
//Author: Andrew Robinson
package main;

import java.util.Scanner;//used for getting keyboard input

public class converter {
	
	static Scanner in = new Scanner(System.in);//established as a static object to be used in multiple methods
	
	public static void main (String[] args) {
		
		int input;
		double baseNum = 0;
		double resultNum;
		String temp = "";
		input = collectInput();//get input
		
		System.out.println(input);
		//print input for testing
		
		System.out.println("Please input your base measurement, or enter 'e' to exit.");
		temp = in.next();
		
		if(temp.equals("e")) {
			System.out.println("Program will now exit.");
			System.exit(0);//exit
		} else {
			baseNum = Double.parseDouble(temp);
		}
		
		if((int)input/100 == 1) {
			System.out.println("Distance Conversion");
			System.out.println("Base: " + baseNum);
			resultNum= distConverter(baseNum, input);
			System.out.println("Converted Number: " + resultNum);
		} else if((int)input/100 == 2) {
			System.out.println("Temperature Conversion");
			System.out.println("Base: " + baseNum);
			resultNum = tempConverter(baseNum, input);
			System.out.println("Converted Number: " + resultNum);
		} else {
			System.exit(0);//exit
		}
		
			
	}
	
	//Distance Conversion
	static double distConverter(double base, int code) {
		double result = -0;
		
		code -=100;
		
		if((int)(code/10) == 1) {//from miles
			code -=10;
			
			switch(code){
			
			case 1://to feet
				result = base*5280;
				break;
			case 2://to kilometer
				result = base*1.60934;
				break;
			case 3://to meters
				result = base*1609.34;
				break;
			default:
				break;
			
			}
			
		} else if((int)(code/10) == 2) {//from feet
			
			code -=20;
			
			switch(code){
			
			case 1://to miles
				result = base/5280;
				break;
			case 2://to kilometer
				result = base*0.0003048;
				break;
			case 3://to meters
				result = base*.03048;
				break;
			default:
				break;
			
			}
			
		} else if((int)(code/10) == 3) {//from kilometers
			
			code -=30;
			
			switch(code){
			
			case 1://to miles
				result = base*0.621371;
				break;
			case 2://to feet
				result = base*3280.84;
				break;
			case 3://to meters
				result = base*1000;
				break;
			default:
				break;
			}
			
		} else if((int)(code/10) == 4) {//from meters
			
			code -=40;
			
			switch(code){
			
			case 1://to miles
				result = base*0.000621371;
				break;
			case 2://to feet
				result = base*3.28084;
				break;
			case 3://to kilometers
				result = base*0.001;
				break;
			default:
				break;
		}
			
		} else {}
		
		return result;
	}
	
	//Temperature Conversion
	static double tempConverter(double base, int code) {
		double result = -0;
		
		code -= 200;
		
		if((int)(code / 10) == 1) {//Fahrenheit
			code -= 10;
			
			switch(code){
				case 1://to celsius
					result = (base-32)*(5/9);
					break;
				case 2://to kelvin
					result = (base-32)*(5/9)+273.15;
					break;
				default:
					break;
			}
			
		} else if((int)(code / 10) == 2) {//celsius
			code -= 20;
			
			switch(code){
			case 1://to fahrenheit
				result = base*(9/5)+32;
				break;
			case 2://to kelvin
				result = base+273.15;
				break;
			default:
				break;
			}
			
		} else if((int)(code / 10) == 3) {//kelvin
			code -= 30;
			
			switch(code){
			case 1://to fahrenheit
				result = base*(9/5)+459.67;
				break;
				
			case 2://to celsius
				result = base-273.15;
				break;
			default:
				break;
			}
			
		} else {}
		
		return result;
	}
	
	//user input
	static int collectInput() {
		//uses a series of switch statements to collect users input and encodes that input as a 3 digit number
		int input = 0;
		
		//initial input prompt
		System.out.println("Please select which type of units you wish to convert between (input the number of the choice.");
		System.out.println("");
		System.out.println("1. Distance");
		System.out.println("2. Temperature");
		System.out.println("3. Exit");
		//System.out.println("3. Volume/mass (cooking and baking)");
		
		//use the Scanner object to get next input from console
		input = in.nextInt();
		input *= 10;//multiplying input for easier handling later
		
		switch(input) {
		case 10://get second input for specifics
			System.out.println("Please select which unit is your base (input the number of the choice.");
			System.out.println();
			System.out.println("1. Miles");
			System.out.println("2. Feet");
			System.out.println("3. Kilometers");
			System.out.println("4. Meters");
			System.out.println("5. Exit");
			
			input += in.nextInt();
			input *= 10;//multiplying input for easier handling later
			
			switch(input) {
			case 110:
				System.out.println("Please select which unit you are converting to (input the number of the choice.");
				System.out.println();
				System.out.println("1. Feet");
				System.out.println("2. Kilometers");
				System.out.println("3. Meters");
				
				input += in.nextInt();
				
				break;
				
			case 120:
				System.out.println("Please select which unit you are converting to (input the number of the choice.");
				System.out.println();
				System.out.println("1. Miles");
				System.out.println("2. Kilometers");
				System.out.println("3. Meters");
				
				input += in.nextInt();
				
				break;
				
			case 130:
				System.out.println("Please select which unit you are converting to (input the number of the choice.");
				System.out.println();
				System.out.println("1. Miles");
				System.out.println("2. Feet");
				System.out.println("3. Meters");
				
				input += in.nextInt();
				
				break;
				
			case 140:
				System.out.println("Please select which unit you are converting to (input the number of the choice.");
				System.out.println();
				System.out.println("1. Miles");
				System.out.println("2. Feet");
				System.out.println("3. Kilometers");
				
				input += in.nextInt();
				
				break;
				
			case 150: System.exit(0);//exit
			
			default:
				
				System.out.println("You have selected an invalid option. Please press enter to reset and select again.");		
				break;
			
			}
			
			break;
			
		case 20:
			
			System.out.println("Please select which unit is your base (input the number of the choice.");
			System.out.println();
			System.out.println("1. Celsius");
			System.out.println("2. Fahrenheit");
			System.out.println("3. Kelvin");
			
			input += in.nextInt();
			input *= 10;//multiplying input for easier handling later
			
			switch(input) {
			case 210:
				System.out.println("Please select which unit you are converting to (input the number of the choice.");
				System.out.println();
				System.out.println("1. Fahrenheit");
				System.out.println("2. Kelvin");
				
				input += in.nextInt();
				
				break;
				
			case 220:
				
				System.out.println("Please select which unit you are converting to (input the number of the choice.");
				System.out.println();
				System.out.println("1. Celsius");
				System.out.println("2. Kelvin");
				
				input += in.nextInt();
				
				break;
				
			case 230:
				
				System.out.println("Please select which unit you are converting to (input the number of the choice.");
				System.out.println();
				System.out.println("1. Celsius");
				System.out.println("2. Fahrenheit");
				
				input += in.nextInt();
				
				break;
				
			default:
				
				System.out.println("You have selected an invalid option. Please press enter to reset and select again.");		
				break;
			
			}
			
			break;
			
		case 30: System.exit(0);//exit
			
		default:
			
			System.out.println("You have selected an invalid option. Please try again.");
			
			break;
		}		
		
		return input;
	}

}