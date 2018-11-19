package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) {
		
		Question one = new TrueFalseQuestion("1 + 1 = 2", "True");
		Question two = new TrueFalseQuestion("2 + 2 = 5", "False");
		Question three = new TrueFalseQuestion("1 + 1 = 2", "True");
		Question four = new TrueFalseQuestion("2 + 2 = 5", "False");
		Question five = new TrueFalseQuestion("1 + 1 = 2", "True");
		
		
		
		
		
		Quiz quiz1 = new Quiz();
		quiz1.addQuestion(one);
		quiz1.addQuestion(two);
		quiz1.addQuestion(three);
		quiz1.addQuestion(four);
		quiz1.addQuestion(five);
		
		quiz1.giveQuiz();
	}

}
