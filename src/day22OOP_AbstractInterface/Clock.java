package day22OOP_AbstractInterface;

import java.time.LocalTime;

public class Clock implements Alarm {

	public void showTime () {
		System.out.println("It is <" + LocalTime.now()+ ">");
	}
	
	public void setAlarm () {
		System.out.println("Clock: Setting up the alarm");
	}
}
