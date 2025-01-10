package OPP_Level_3_Problems;

public class CounstructorChaining {
	CounstructorChaining(){
		this(20);
		System.out.println("This is Default Counstructor!");
	}
	CounstructorChaining(int x){
		System.out.println("This is Pramitarized Counstructor With Single Parameter");
		System.out.println("The Value of X  : "+ x+ " and is called from default counstructor using this(20)");
	}
	CounstructorChaining(int x, int y){
		this();
		System.out.println("This is Pramitarized Counstructor With two Parameter");
		System.out.println("The value of X : "+x);
		System.out.println("The value of y : "+y);
		System.out.println("The addition of x & y : "+(x+y));
	}
	
	public static void main(String[] args) {
		CounstructorChaining obj = new CounstructorChaining(11,12);
	}
}
