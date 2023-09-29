package pack;

public class MetodOverridingPgm2 extends MetodOverridingPgm1 {
	@Override
	public void run()
	{
		System.out.println("Child class run");

	}
	public void display()
	{
		run();
		super.run();
	}
	public static void main(String[] args) {
		MetodOverridingPgm2 t=new MetodOverridingPgm2 ();
		t.display();

	}

}
