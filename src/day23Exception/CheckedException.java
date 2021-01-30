package day23Exception;

import java.io.File;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File file = new File ("file location");
		
		try {
		FileReader fe = new FileReader(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
