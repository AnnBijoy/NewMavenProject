package pack;

public class ExceptionPropogationExample {
	public void methodA(){
		try
		{		methodB();
	}
		catch (Exception e) {
			System.out.println("handled");
		}
	}
	
	
	public void methodB() throws ArithmeticException {
		methodC();
		
	}


	public void methodC()throws ArithmeticException{
	int a=10/0;
	throw new ArithmeticException();
	}

	public static void main(String[] args) {
		ExceptionPropogationExample cc=new ExceptionPropogationExample();
		cc.methodA();

	}

}
