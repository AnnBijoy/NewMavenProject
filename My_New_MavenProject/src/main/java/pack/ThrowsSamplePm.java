package pack;

public class ThrowsSamplePm  {
public void divNum(int n,int m) throws ArithmeticException {
	int div=n/m;
	System.out.println(div);
}
	public static void main(String[] args) {
		ThrowsSamplePm t=new ThrowsSamplePm();
	try {	t.divNum(40, 0);
	
	}
	catch(ArithmeticException e) {
		System.out.println("Exception handled");
	}
		System.out.println("Rest of the code");

	}

}
