package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {
	String question;
	String answer;
	public MultipleChoiceQuestion(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	@Override
	public String getTheQuestionText() {
		return question;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		if(this.answer.compareTo(answer) == 0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String getCorrectAnswer() {

		return answer;
	}

}
