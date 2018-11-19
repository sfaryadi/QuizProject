package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) {
		
		Question one = new TrueFalseQuestion("1 + 1 = 2", "True");
		Question two = new TrueFalseQuestion("2 + 2 = 5", "False");
		Question three = new TrueFalseQuestion("1 + 1 = 2", "True");
		Question four = new TrueFalseQuestion("2 + 2 = 5", "False");
		Question five = new TrueFalseQuestion("1 + 1 = 2", "True");
		Question six = new MultipleChoiceQuestion("Purple is a: A: color B: shape C: number", "C");	
		Question seven = new MultipleChoiceQuestion("Purple is a: A: color B: shape C: number", "C");
		Question eight = new MultipleChoiceQuestion("Purple is a: A: color B: shape C: number", "C");
		Question nine = new MultipleChoiceQuestion("Purple is a: A: color B: shape C: number", "C");
		Question ten = new MultipleChoiceQuestion("Purple is a: A: color B: shape C: number", "C");
		Question eleven = new ShortAnswerQuestion("What factors have contributed to Gibson declaring bankrupt?");

		
		
		
		Quiz quiz1 = new Quiz();
		quiz1.addQuestion(one);
		quiz1.addQuestion(two);
		quiz1.addQuestion(three);
		quiz1.addQuestion(four);
		quiz1.addQuestion(five);
		quiz1.addQuestion(six);
		quiz1.addQuestion(seven);
		quiz1.addQuestion(eight);
		quiz1.addQuestion(nine);
		quiz1.addQuestion(ten);
		quiz1.addQuestion(eleven);
		quiz1.giveQuiz();
	}

}
