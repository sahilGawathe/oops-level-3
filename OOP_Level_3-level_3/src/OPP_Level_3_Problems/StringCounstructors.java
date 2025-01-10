package OPP_Level_3_Problems;

class Super{
	Super(){
		String superStringObj = new String("This is Super Class");
		System.out.println(superStringObj);
	}
}
class Sub extends Super{
	
	Sub (){
		String subStringObj = new String("This is Sub Class");
		System.out.println(subStringObj);
		
	}
	
}
public class StringCounstructors {
	public static void main(String[] args) {
		Sub subObj = new Sub();
	}
}
