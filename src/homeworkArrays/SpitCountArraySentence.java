package homeworkArrays;

import java.util.Arrays;

public class SpitCountArraySentence {

	public static void main(String[] args) {
		/*Write a Program to count the number of characters, words, and sentences.
article = 
			"With the IT boom in the past decade, software development and testing have become one of the most popular job aspirations. 
			Millennials are increasingly seeking more opportunities to take up software testing as a career path. 
			Except for those who actually work in the field, the term software testing is vague and not so easy to understand. 
			Well, to put it simply, software testing is the process of checking or testing software or a computer application for any bugs or errors. 
			The intent of the profile is to ensure that the final software that hits the market is glitch-free. 
			The software after testing must run smoothly for the users, this is ultimately the goal of a software tester. 
			Now that you know what a software tester is, we bet you would be curious about what does a software tester does. 
			The day to day activities of a software tester is not limited to simply checking the bugs in software. 
			It encompasses various components. 
			The idea is to ensure the delivery of a glitch-free product that is market-ready. 
			Following are the activities that a software test does on a daily basis";*/ 

		
		String article = "\"With the IT boom in the past decade, software development and testing have become one of the most popular job aspirations. \r\n" + 
				"Millennials are increasingly seeking more opportunities to take up software testing as a career path. \r\n" + 
				"Except for those who actually work in the field, the term software testing is vague and not so easy to understand. \r\n" + 
				"Well, to put it simply, software testing is the process of checking or testing software or a computer application for any bugs or errors. \r\n" + 
				"The intent of the profile is to ensure that the final software that hits the market is glitch-free. \r\n" + 
				"The software after testing must run smoothly for the users, this is ultimately the goal of a software tester. \r\n" + 
				"Now that you know what a software tester is, we bet you would be curious about what does a software tester does. \r\n" + 
				"The day to day activities of a software tester is not limited to simply checking the bugs in software. \r\n" + 
				"It encompasses various components. The idea is to ensure the delivery of a glitch-free product that is market-ready. \r\n" + 
				"Following are the activities that a software test does on a daily basis\"";
		
		//1.split period for sentences.
		String senArticle [] = article.split("\\.");
		System.out.println("There are : "+senArticle.length+ " sentences.");
		
		//2.split white spaces for words.
		String wordscArticle [] = article.split(" ");
		
		// count off what is not word such as " , a
		int countComma = 0 ;
		int countQuot = 0 ;
		int countA = 0;
		int space = 0;
		int period = 0;
		
		
		for (int i = 0; i < wordscArticle.length; i++) {			
			if (wordscArticle [i].contains("a")) {
				countA ++;
			} 
		}
		int remove = countComma + countQuot+ countA ;
		int wordsTotal = wordscArticle.length;
		int sum = wordsTotal - remove;
		
		System.out.println("There are : " + sum + " words.");
		
		//3.split  for char.
		String newChar [] = article.split("");
		
		
//		for (int i = 0; i < newChar.length; i++) {
//			if (newChar [i].contains(",")) {
//				countComma ++;
//			}
//			if (newChar [i].contains("\"")) {
//				countQuot ++;
//			}
//			if (newChar [i].contains(" ")) {
//				space ++;
//			}
//			if (newChar [i].contains("\\.")) {
//				period ++;
//			}
//		}
//		
		int removeChar = countComma + countQuot + space +period ;
		int charTotal = newChar.length;
		int sumChar = charTotal - removeChar ;
		System.out.println("There are : " + sumChar + " characters.");
	}

}
