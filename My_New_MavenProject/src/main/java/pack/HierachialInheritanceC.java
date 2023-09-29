package pack;

public class HierachialInheritanceC extends HierachialInheritanceA{
	String child2="Child 2 of A";
	public void runC()
	{
		System.out.println("Child Class2");
	}
	public static void main(String[] args) {
		
		HierachialInheritanceC obj=new HierachialInheritanceC();
		obj.runA();
		obj.runC();
		System.out.println(obj.child2);
		System.out.println(obj.a);
	}

}
