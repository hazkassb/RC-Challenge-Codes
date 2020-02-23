package myRCApplicationProject;

import java.util.Scanner;

/**
 * @author HamzaBoubacar
 * 
 * Problem:
 * Given a time (in 24-hour format) with missing digits marked as '?', 
 * we want to replace all of the question marks by digits (0-9) in such 
 * a way as to obtain the latest possible time. The earliest possible time 
 * is 00:00 and the latest valid time is 23:59.
 *
 * Example
 * 	1. Given T = "2?:?8", the function should return "23:58".

 *	2. Given T = "?8:4?", the function should return "18:49".

 *	3. Given T = "??:??", the function should return "23:59".

 *	4. Given T = "06:34", the function should return "06:34".

 *
 */
public class TimeFormat {
	
	//	Constructor
	public TimeFormat(Scanner scan, String t) {
		super();
	}


	public static String formatTime(String T) {
		
//		Data fields
		char hour1 = T.charAt(0);
		char hour2 = T.charAt(1);
		char minute1 = T.charAt(3);
		char minute2 = T.charAt(4);
		
		
		//minute 2 must be '9' if it is ?
		if (minute2 == '?') {
			minute2 = '9';
		}
		
		//minute 1 must be '5' if it is ?
		if (minute1 == '?') {
			minute1 = '5';
		}
		
		//hour 1, max is 23
		if (hour1 == '?') {
			if (hour2 != '?' && hour2 > '3') {
				hour1 = '1';	
			}else {
				hour1 = '2';
			}
			
		}
		
		//hour 2
		if (hour2 == '?') {		
			if (hour1 == '0' || hour1 == '1') { //max 09 or 19
				hour2 = '9';
			}else {
				hour2 = '3'; //max 23
			}
		}
		
		return "" + hour1 + hour2 + ":" + minute1 + minute2;
	}


	public static void main(String[] args) {
		
//		Test Cases
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter time in 24h format: ");
		String t = scan.nextLine();
		
		System.out.println(TimeFormat.formatTime(t));
		
		scan.close();
	}

}
