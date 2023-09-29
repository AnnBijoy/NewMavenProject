package pack;

public class SamplePgmException {
public void checkNum(int num) {
	if(num<1) {
		throw new ArithmeticException("negative number");
	}
	else {
		System.out.println("Positive Number");
	}}

	public static void main(String[] args) {
		SamplePgmException s=new SamplePgmException();
		try {
			s.checkNum(-2);
		}
catch(Exception e)
		{System.out.println("Exception handled");

}
	}
	
}
