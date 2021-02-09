package practiceInterviewTask;

public class ReturnBooTakeStringPara {

	public static void main(String[] args) {

		System.out.println(test("king "));

	}


	
	public static boolean test(String arg1) {
		String ch1 = arg1;
		String ch2 = "King";

		if (ch1.equalsIgnoreCase(ch2)) {
			return true;
		} else {
			return false;
		}

	}



}// end class

 