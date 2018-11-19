package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {

	int correctCounter;
	Question questions[] = new Question[25];
	String userAnswers[] = new String[25];
	double grade = correctCounter / 25;
	
	
	public void addQuestion(Question q) {
		for(int i = 0; i < questions.length; i++) {
		if(questions[i] == null) {
		questions[i] = q;
		break;
		}
	
		}
		
		
	}
	public double giveQuiz() {

		for(int i =0; i <= questions.length; i++) {
			System.out.println(questions[i]);
			Scanner scan = new Scanner(System.in);
			userAnswers[i] = scan.nextLine();
			
			if(userAnswers[i].compareTo(questions[i].getCorrectAnswer()) == 0) {
				correctCounter++;
				System.out.println("Correct!");

			}
				
				
		}
		
		
	
		
		
		return grade; 	
	}
	

}