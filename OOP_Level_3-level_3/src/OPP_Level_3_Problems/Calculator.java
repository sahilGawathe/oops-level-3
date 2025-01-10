package OPP_Level_3_Problems;

abstract class Oprations{
	abstract int add(int num1, int num2);
	abstract int sub(int num1, int num2);
	abstract int mul(int num1, int num2);
	abstract double div(int num1, int num2);
}

class SimplerCalculator extends Oprations{
	int add(int num1, int num2) {
		return num1+num2;
	}

	int sub(int num1, int num2) {
		return num1-num2;
	}

	int mul(int num1, int num2) {
		return num1*num2;
	}

	double div(int num1, int num2) {
		return (double) num1/num2;
	}
	
}

public class Calculator {
	
	public static void main(String[] args) {
		SimplerCalculator calculator = new SimplerCalculator();
		
		int sum = calculator.add(10, 5);
        int difference = calculator.sub(10, 5);
        int product = calculator.mul(10, 5);
        double quotient = calculator.div(10,5);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
	}
}
