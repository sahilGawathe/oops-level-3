package OPP_Level_3_Problems;

public class BankAccount {
	
	double principal,roi,year;
		public BankAccount(double principal, double roi, double year) {
			this.principal = principal;
			this.year = year;
			this.roi = roi;
		}
		
	static class Intrest{	
		double simpleIntrest;
		double calIntrest(double principal, double roi, double year) {
			BankAccount obj = new BankAccount(principal,roi,year);
			simpleIntrest = (obj.principal * obj.roi * obj.year)/100;
			return simpleIntrest;
		}
	}
	
	public static void main(String[] args) {
		Intrest obj = new Intrest();
		System.out.println(obj.calIntrest(100000, 7.4, 5));
	}
	
}
