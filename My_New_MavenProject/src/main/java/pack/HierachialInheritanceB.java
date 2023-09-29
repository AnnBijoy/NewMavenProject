package pack;

public class HierachialInheritanceB extends HierachialInheritanceA{
	String child="Child 1 of A";
	public void runB()
	{
		System.out.println("Child Class1");
	}
	public static void main(String[] args) {

		HierachialInheritanceB b=new HierachialInheritanceB();
		b.runA();
		b.runB();
		System.out.println(b.child);
		System.out.println(b.a);
	}

}
