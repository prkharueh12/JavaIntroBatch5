package day10JavaLoops;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		Random numRandom = new Random();
		System.out.println(numRandom.nextInt(10));
		System.out.println(numRandom.nextDouble());
		System.out.println(numRandom.nextDouble()*100);

	}

}
