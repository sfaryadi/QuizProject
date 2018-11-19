package edu.unca.csci201;

public class ShortAnswerQuestion implements Question {
	String question;
	@Override
	public String getTheQuestionText() {
		return null;
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
