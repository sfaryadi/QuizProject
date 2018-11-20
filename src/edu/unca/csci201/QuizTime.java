package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) {
		/*String[] numbers = {	"one",
							"two",
							"three",
							"four",
							"five",
							"six",
							"seven",
							"seven",
							"eight",
							"nine",
							"ten",
							"eleven",
							"twelve",
							"thirteen",
							"fourteen",
							"fifteen",
							"sixteen",
							"seventeen",
							"eighteen",
							"nineteen",
							"twenty",
							"twentyone",
							"twentytwo",
							"twentythree",
							"twentyfour",
							"twentyfive"
		}
		*/
		Question one = new TrueFalseQuestion("It's time to kick out the jams!", "True");
		Question two = new TrueFalseQuestion("I am the walrus", "True");
		Question three = new TrueFalseQuestion("I'm a tumbler!", "True");
		Question four = new TrueFalseQuestion("When I die and they lay me to rest, gonna go to the place that's the best", "True");
		Question five = new TrueFalseQuestion("I love these scones!", "True");
		Question six = new TrueFalseQuestion("1 + 1 = 2", "True");
		Question seven = new TrueFalseQuestion("Morrissey never says regretable things", "False");
		Question eight = new TrueFalseQuestion("\"The limit does not exist!\"", "True");
		Question nine = new TrueFalseQuestion("These questions are objectively correct answers", "False");
		Question ten = new TrueFalseQuestion("The beat goes on", "True");
		Question eleven = new TrueFalseQuestion("The world pulses and it swivels and bops", "True");
		Question twelve = new TrueFalseQuestion("He knows about second breakfast", "False");
		Question thirteen = new MultipleChoiceQuestion("You realize with fright that Spider-Man is having you for dinner tonight. What is the correct response to this information: A: \"Uh oh\" B: *SLUUUURRRRPPPP* C: \"Hell yeah!\" ", "B");	
		Question fourteen = new MultipleChoiceQuestion("Can I get a HELL YEAH?: A: No B: Watch your profamity C: HELL YEAH", "C");
		Question fifteen = new MultipleChoiceQuestion("You may find yourself: A: Behind the wheel of a large automobile B: Living in a shotgun shack C: Both", "C");
		Question sixteen = new MultipleChoiceQuestion("Iggy and the: A: Blues Brothers B: Hoagies C: Stooges", "C");
		Question seventeen = new MultipleChoiceQuestion("What is the correct number of eyes in Glenn Danzig's head?: A 20 B: 2 C: 1", "A");
		Question eighteen = new MultipleChoiceQuestion("What would David Byrne do with $50?: A: Uh oh B: Get something to eat C: I'll tell you later", "B");
		Question nineteen = new MultipleChoiceQuestion("D O W N THAT's THE WAY WE GET : A: DOWN B: DUMB C: DEAD", "A");
		Question twenty = new MultipleChoiceQuestion("Potatoes: A: Boil em, mash em, stick em in a stew B: What's taters? C: Famine", "A");
		Question twentyone = new MultipleChoiceQuestion("You can't have any pudding if you don't eat your: A: Pudding B: Meat C: Vitamins", "B");
		Question twentytwo = new MultipleChoiceQuestion("Who is sitting on the park bench?: A: Aqualung B: Locomotive Breath C: Gerald Bostock", "A");
		Question twentythree = new MultipleChoiceQuestion("Obligitory Star Trek question: A: Star Trek answer B: Star Wars answer C: War Stars answer", "A");
		Question twentyfour = new ShortAnswerQuestion("Give one reason for Singapore's economic development since 1965");
		Question twentyfive = new ShortAnswerQuestion("What is Spider-Man having for dinner tonight?");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
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
		quiz1.addQuestion(twelve);
		quiz1.addQuestion(thirteen);
		quiz1.addQuestion(fourteen);
		quiz1.addQuestion(fifteen);
		quiz1.addQuestion(sixteen);
		quiz1.addQuestion(seventeen);
		quiz1.addQuestion(eighteen);
		quiz1.addQuestion(nineteen);
		quiz1.addQuestion(twenty);
		quiz1.addQuestion(twentyone);
		quiz1.addQuestion(twentytwo);
		quiz1.addQuestion(twentythree);
		quiz1.addQuestion(twentyfour);
		quiz1.addQuestion(twentyfive);
	

		
		
		
		
		
		
		
		quiz1.giveQuiz();
	}

}
