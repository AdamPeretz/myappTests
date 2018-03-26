package com;

public class array {

	public static void arra() {
		
		int numberOfPage = 0;
		int haveQuestionnaire = 1;
		int haveEmail = 2;
		int numerTabOfTFS = 3;
		
		
		int[][] allDataLessons = new int[][]{
			//how many page, boolean "questionnaire", boolean "email", Leading to TFS(1 activity, 2 weight, 3 meals, 4 health habit)
			  { 5, 1, 0, 0}, //lesson 0
			  { 0, 0, 0, 0}, //lesson 1
			  { 0, 0, 0, 0}, //lesson 2
			};
			
			System.out.println(allDataLessons[0][numberOfPage]);
		
	}
	

}
