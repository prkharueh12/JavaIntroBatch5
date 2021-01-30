package day22OOP_AbstractInterface;

public class Iphone implements Alarm {
	public void call () {
		System.out.println("Calling");
	}
	
	public void zoomMeeting () {
		System.out.println("iPhone is processing");
	}
	
	public void setAlarm () {
		System.out.println("Iphone: Setting up the alarm");
	}
}
