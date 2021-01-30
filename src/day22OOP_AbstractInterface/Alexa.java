package day22OOP_AbstractInterface;

import java.time.LocalTime;

public class Alexa implements Alarm {
	public void alexaWTIS () {
		System.out.println("It is <" + LocalTime.now()+ ">");
	}
	
	public void setAlarm () {
		System.out.println("Alexa: Setting up the alarm");
	}

	
}
