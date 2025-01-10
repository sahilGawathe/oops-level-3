package OPP_Level_3_Problems;

public class Employee {
	String name;
	int id;
	
	Employee(int id, String name){
		this.name = name;
		this.id = id;
	}
	void display () {
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+ this.name);
	}
	
	static void swap(Employee emp1, Employee emp2) {
		int tempId = emp1.id;
		String tempName = emp1.name;
		
		emp1.id = emp2.id;
		emp1.name = emp2.name;
		
		emp2.id = tempId;
		emp2.name = tempName;
	}
	
	public static void main(String[] args) {
		Employee obj1 = new Employee(101,"Abhishek");
		Employee obj2 = new Employee(102, "Raj");
		
		System.out.println("Before Swapping Objects : ");
		obj1.display();
		obj2.display();
		
		System.out.println("After Swappin Objects : ");
		swap(obj1,obj2);
		obj1.display();
		obj2.display();
		
	}
}
