package day11StringObject;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		Random ranNum = new Random();
		
		String areaCode = "703";
		int num2 = ranNum.nextInt(1000);
		int num3 = ranNum.nextInt(10000);
		
		String phone1 = Integer.toString(num2);
		String phone2 = Integer.toString(num3);
		
		String phoneNumber = areaCode.concat("-"+phone1).concat("-"+phone2);
		
		
		if (phoneNumber.length() == 12 ) {
			System.out.println(phoneNumber);
		}else {
			System.out.println("Invalid phone number"+ phoneNumber); // Ex. Invalid phone number 703-54-3456
		}
			

	}

}
