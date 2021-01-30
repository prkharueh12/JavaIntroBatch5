package homeworkArrays;

public class PrintPatterArrays {

	public static void main(String[] args) throws InterruptedException {
		
		
		String dash[] = { "-", "-", "-", "-", "-", "-", "-", "-", "-" };
		for (int j = 0; j <= 10; j++) {
			System.out.println();

			for (int i = 0; i < dash.length; i++) {
				System.out.print(dash[i] + " ");
				Thread.sleep(100);
			}
		}

	}

}
