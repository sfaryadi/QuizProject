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

		for(int i = 0; i <  5 ; i++) {
			System.out.println(questions[i].getTheQuestionText());
			System.out.println("True or false?");
			Scanner scan = new Scanner(System.in);
			userAnswers[i] = scan.nextLine();
			
			if(userAnswers[i].compareTo(questions[i].getCorrectAnswer()) == 0) {
				correctCounter++;
				System.out.println("Correct!");

			}else {
				System.out.println("Sorry, that's incorrect.");

			}
				
				
		}for(int j = 5; j <  10 ; j++) {
			System.out.println(questions[j].getTheQuestionText());
			System.out.println("Choose A, B, or C");
			Scanner scan = new Scanner(System.in);
			userAnswers[j] = scan.nextLine();
			
			if(userAnswers[j].compareTo(questions[j].getCorrectAnswer()) == 0) {
				correctCounter++;
				System.out.println("Correct!");

			}else {
				System.out.println("Sorry, that's incorrect.");

			}
				
				
		}
		
		
	
		
		
		return grade; 	
	}
	

}