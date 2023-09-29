package pack;

public class ExamplePgmFortrycatchfinally {

	public static void main(String[] args) {
		int a=10,b=20,sum;
		try
		{
			int s=10/0;

		}
		catch(Exception e)
		{
			System.out.println("Exception handled");

		}
		sum=a+b;
		System.out.println(sum);
	}

}
