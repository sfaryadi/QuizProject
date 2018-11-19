package edu.unca.csci201;

public class Quiz {

	int correctCounter;
	Question questions[] = new Question[25];
	double grade = correctCounter / 25;
	
	
	public void addQuestion(Question q) {
		for(int i = 0; i < questions.length; i++) {
		
		questions[i] = q;
	
			
		}
		
		
	}
	public double giveQuiz() {

		for(int i =0; i <= questions.length; i++) {
			System.out.println(questions[i]);
			
		}
		
		
		if(userAnswer == answer) {
			correctCounter++;
		}
		
		
		
		return grade; 	
	}
	

}