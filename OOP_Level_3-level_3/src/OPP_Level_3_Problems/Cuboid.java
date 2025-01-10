package OPP_Level_3_Problems;

import java.util.Scanner;

public class Cuboid {
	double length,breadth,height;
	double calVolume() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of Cuboid : ");
		length = sc.nextDouble();
		System.out.println("Enter the breadth of Cuboid : ");
		breadth = sc.nextDouble();
		System.out.println("Enter the height of Cuboid : ");
		height = sc.nextDouble();
		
		return length * breadth * height;
	}
	
	public static void main(String [] args) {
		Cuboid obj = new Cuboid();
		System.out.println("The Volume of Cuboid is : "+obj.calVolume());
	}
}
