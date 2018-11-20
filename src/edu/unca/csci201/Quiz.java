package edu.unca.csci201;

import java.util.Random;
import java.util.Scanner;

public class Quiz {

	int correctCounter = 0;
	Question questions[] = new Question[25];
	String userAnswers[] = new String[25];

	
	
	public void addQuestion(Question q) {
		for(int i = 0; i < questions.length; i++) {
		if(questions[i] == null) {
		questions[i] = q;
		break;
		}
	
		}
		
		
	}
	public double giveQuiz() {
		Random rand = new Random(25);
		int num = rand.nextInt();
		
	
		for(int i = 0; i <=  11 ; i++) {
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
				
				
		}for(int j = 12; j <= 22 && j >= 12 ; j++) {
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
		}for(int j = 23; j <= 24 && j >= 23 ; j++) {
			System.out.println(questions[j].getTheQuestionText());
			System.out.println("Write your answer");
			Scanner scan = new Scanner(System.in);
			userAnswers[j] = scan.nextLine();
			System.out.println("Your answer must be graded by the professor");

		



			}
		
		
				
		

		
	
		double grade = correctCounter / 23;
		System.out.println("You made " + grade + ", not including the questions that await grading." );
		return grade; 	
	}
	

}