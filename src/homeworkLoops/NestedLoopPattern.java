package homeworkLoops;

public class NestedLoopPattern {

	public static void main(String[] args) throws InterruptedException {
		/*Write a Java program to print the following grid:

					Expected Output :
					- - - - - - - - -                                                                                           
					- - - - - - - - -                                                                                           
					- - - - - - - - -                                                                                           
					- - - - - - - - -                                                                                           
					- - - - - - - - -                                                                                           
					- - - - - - - - -                                                                                           
					- - - - - - - - -                                                                                           
					- - - - - - - - -                                                                                           
					- - - - - - - - -                                                                                           
					- - - - - - - - -  

*/
//			String dash = "-";
//			for (int i = 1; i <= 10; i++) {
//				System.out.println();
//				for (int j = 1; j < 9; j++) {
//				System.out.print(dash+ " ");
//				Thread.sleep(100);
//				}
//				System.out.println(dash);
//			}
		
		String dash[] = { "-", "-", "-", "-", "-", "-", "-", "-", "-" };
		for (int j = 0; j <= 10; j++) {
			System.out.println();

			for (int i = 0; i < dash.length; i++) {
				System.out.print(dash[i] + " ");
			}
		}
	}
}
