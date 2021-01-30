package day22OOP_AbstractInterface;

public class TestMain {

	public static void main(String[] args) {
//		Iphone cell = new Iphone ();
//		cell.setAlarm();
//		
//		Alexa talk = new Alexa ();
//		talk.alexaWTIS();
//		
//		Clock clk = new Clock ();
//		clk.showTime();
		
		//create Alarm intance 
		
//		Alarm iphone = new Iphone ();
//		iphone.setAlarm();
//		
//		Alarm alexa = new Alexa ();
//		alexa.setAlarm();
//		
//		Alarm clock = new Clock ();
//		clock.setAlarm();
		
		
		testingAlarm(new Iphone());
		testingAlarm(new Alexa());
		testingAlarm(new Clock());

	}
 private static void testingAlarm(Alarm a) {
	 a.setAlarm();
 }
}
