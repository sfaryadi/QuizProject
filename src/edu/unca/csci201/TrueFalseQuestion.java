package edu.unca.csci201;

public class TrueFalseQuestion implements Question {

	
	
	
	@Override
	public String getTheQuestionText() {
		return null;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		if(answer == userAnswer) {
			return true;
		}
	}

	@Override
	public String getCorrectAnswer() {
		return null;
	}

}
