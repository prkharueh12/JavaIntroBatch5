package day19OOP_Inheritance;

public class PhysicTeacher extends Teacher  {
	
	String mainSubject = "Physics";
	
	public static void main(String[] args) {
		Teacher t = new Teacher ();
		System.out.println(t.collegeName);

		PhysicTeacher pt = new PhysicTeacher ();
		
//		pt.does();
//		System.out.println(pt.designation);
//		System.out.println(pt.mainSubject);
//		
		JavaExample test = new JavaExample (); //declare instance type from JavaExample
//		System.out.println(test.collegeName);
//		System.out.println(test.designation);
//		test.does();
		
		test.learningJavaSuper(); // calling from JavaExample!
	}

}
