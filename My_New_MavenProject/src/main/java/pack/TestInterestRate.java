package pack;

public class TestInterestRate {

	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		int interest_sbi=b.getRateOfInterest();
		System.out.println("interest rate is"+interest_sbi);
		b=new HDFC();
		int interest_hdfc=b.getRateOfInterest();
		System.out.println("interest rate is"+interest_hdfc);

	}

}
