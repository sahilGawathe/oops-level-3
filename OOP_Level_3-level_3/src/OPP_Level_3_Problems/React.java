package OPP_Level_3_Problems;

import java.util.Scanner;

public class React {
	void areaReactangle(int length, int breadth) {
		System.out.println("The area of reactangle is : "+ length * breadth );
	}
	
	public static void main(String[] args) {
		React obj = new React();
		Scanner sc = new Scanner(System.in);
		
		int length,breadth;
		System.out.println("Enter the Length of Reactangle : ");
		length = sc.nextInt();
		System.out.println("Enter the Breadth of Reactangle : ");
		breadth = sc.nextInt();
		
		obj.areaReactangle(length,breadth);
	}
}
