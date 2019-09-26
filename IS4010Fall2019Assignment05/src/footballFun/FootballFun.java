/*
 * IS4010 Fal 2019
 * Assignment 05
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	public static String translateScore (int score) {
			
		if(score == 2) {
		System.out.println("safety");}
		else if (score == 3) {
			System.out.println("field goal");}
		else if (score == 6) {
			System.out.println("touchdown");}
		else if (score == 7) {
			System.out.println("Touchdown and extra point");}
		else if (score == 8) {
			System.out.println("Touchdown and 2-point conversion");}
		else if (score == -1) {
			System.out.println("");}
		else if (score == 1) {
			System.out.println("invalid");}
		else if (score == 10) {
			System.out.println("you must be playing Quidditch");}
				
		return "";
	}
}
