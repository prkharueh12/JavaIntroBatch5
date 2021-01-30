package day11StringObject;

public class String_IndexOf {

	public static void main(String[] args) {
		
		// index will always get an index which will start at 0122345........
		// indexOf (enter an actual character ' ')
		// indexOf (enter WORD " ") this will return index at W
		// indexOf (' ' find a character, start at index#  )
		
		String name = "President George Washington";
		
		System.out.println(name.indexOf('W')); // 17
		
		System.out.println(name.indexOf("George")); // 10
		
		//find 'e' start from index 3
		System.out.println(name.indexOf('e', 3)); // 6
		
		System.out.println(name.indexOf("bob")); // -1
		
		//it will point to the normal index, but will catch the first one starting from the right.
		System.out.println(name.lastIndexOf('e')); //15
		 
		
		int indexOfG = name.indexOf('G');
		
		System.out.println(indexOfG);  // 10
		

	}

}
