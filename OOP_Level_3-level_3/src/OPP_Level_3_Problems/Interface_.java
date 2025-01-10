package OPP_Level_3_Problems;

import java.util.Scanner;

interface Shape{ // Implemented Interface shape for differnt shape to calculate area and take input 
	Scanner sc = new Scanner(System.in);
	void input();
	double area();
}

class Reactangle implements Shape{
	double length ,breadth;
	@Override
	public void input() {
		System.out.println("Enter the length of Reactangle : ");
		length = sc.nextDouble();
		System.out.println("Enter the breadth of Reactangle : ");
		breadth = sc.nextDouble();
	}
	@Override
	public double area() {
		return length*breadth;
	}
	
}

class Circle implements Shape{
	double radius, PI = 3.14;
	@Override
	public void input() {
		System.out.println("Enter the Radius of Circle : ");
		radius = sc.nextDouble();
	}
	@Override
	public double area() {
		return PI*(radius*radius);
	}
}

// Main Class
public class Interface_ {
	public static void main(String[] args) {  // main method
		Shape reactangle = new Reactangle();  // created object from Reactangle Class
		Shape circle = new Circle();		  // created object from circle class
		
		reactangle.input();
		System.out.println("The area of Reactangle : "+reactangle.area());
		
		circle.input();
		System.out.println("The area of Circle : "+circle.area());
	}
}
