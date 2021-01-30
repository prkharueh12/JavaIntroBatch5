package day12Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		
		
		String cars [] = {"Tesla", "Ferrari", "Aston", "Jeep"};
		for (String nameCars : cars) {
			//System.out.print(nameCars + ", ");
		}
		
		System.out.println();
		int num [] = {1,2,4,6,78,4,5};
		for (int newNums : num) {
			//System.out.print(newNums + ", ");
		}
		
		System.out.println();
		// use char to access one of element(index) in string line 8
		char charArr []= cars[1].toCharArray();
		
		for(char items: charArr) {
			//System.out.print(items+ ", ");
			
		//boolen Array
			
			
		}
		
		boolean [] results = {true,true,false};
			for(boolean item : results) {
				System.out.print(item + ", ");
			}
		
		
	}
}