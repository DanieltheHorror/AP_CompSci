package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {

		int age = 3;
		String breed = "Big Red Dog";
		String name = "Clifford";
		
	public Dog() {
		age = 3;
		breed = "Big Red Dog";
		name = "Clifford";
	}
	
	public Dog(String newname, int newage, String newbreed) {
		name = newname;
		if (newage == 0) {
			age = 3;
		} else {
			age = newage;
		}
		newbreed = newbreed;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAge(int n) {
	age = n;
	}
	public void setBreed(String n) {
		breed = n;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
	public boolean isSleeping() {
		int ran = (int)(Math.random()*2 + 1);
		if (ran == 1) {
			return true;
		} else {
			return false;
		}
	}
	public void bark() {
		System.out.println(name + " barks!");
	}

}
