package edu.unca.csci201;

public class ShortAnswerQuestion implements Question {
	String question;
	
	public ShortAnswerQuestion(String question) {
		this.question = question;
		
	}
	
	@Override
	public String getTheQuestionText() {
		return question;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		return false;
	}

	@Override
	public String getCorrectAnswer() {
		return null;
	}

}
