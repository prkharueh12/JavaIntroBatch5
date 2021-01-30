package day11StringObject;

public class String_EndWith {

	public static void main(String[] args) {
		String name = "TechCircle";
		System.out.println(name.endsWith("cle"));
		System.out.println(name.startsWith("Tech"));

		if (name.startsWith(name)) {
			System.out.println("TechCircle");
		}
	}

}
