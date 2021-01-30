package day09JavaIfElseSwitch;

public class SwtichBrowser {

	public static void main(String[] args) {
		String browser = "IE";
		String path = "";
		switch (browser) {
		case "Chrome":
			System.out.println("Open Chrome!");
			path = "C://Chrome";
			break;
		case "Firefox":
			System.out.println("Open Firefox!");
			path = "C://Firefox";
			break;
		case "IE":
			System.out.println("Open IE!");
			path = "C://IE";
			break;
		default:
			System.out.println("Current browser is not supported.");
		
			break;
		}
		
		System.out.println("Your browser is "+ browser + " and it is under "+ path);

	}

}
