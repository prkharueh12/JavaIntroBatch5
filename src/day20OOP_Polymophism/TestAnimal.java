package day20OOP_Polymophism;

import java.util.ArrayList;
import java.util.Arrays;

import util.AnimalUtil;

public class TestAnimal extends Animal {

	public static void main(String[] args) {
//			Animal pet1 = new Animal (); 
//			pet1.makeSound();
//			
//			Animal pet2 = new Dog ();
//			pet2.makeSound();
//			
//			Animal pet3 = new Horse ();
//			pet3.makeSound();
//			pet3.walk();
//
//			System.out.println(pet3.name("Kevin"));
//			
//			Dog dog1 = new Dog ();
			
			System.out.println("Import from the util below");
			
			AnimalUtil au = new AnimalUtil(); // can reuse over and over
			
			Animal animal1 = new Horse ();
			au.testAnimal(animal1);
			 
			Animal animal2 = new Dog ();
			au.testAnimal(animal2);
			
			
			ArrayList <Animal> zooList = new ArrayList <Animal> ();
			
			zooList.add(animal1);
			zooList.add(animal2);
			zooList.addAll(Arrays.asList(new Dog(), new Cat()));
			
			for (int i = 0; i < zooList.size(); i++) {
//				zooList.get(i).makeSound();
				au.testAnimal(zooList.get(i));
			}
			
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
