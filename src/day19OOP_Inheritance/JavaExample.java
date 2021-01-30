package day19OOP_Inheritance;

public class JavaExample extends Teacher {

	
	void learningJavaSuper() {
		// super will give you access to the parent class (Teacher)
		super.collegeName = "TechCircle";
		System.out.println(super.collegeName);
		System.out.println(super.designation);
		super.does();
	}
	
}
