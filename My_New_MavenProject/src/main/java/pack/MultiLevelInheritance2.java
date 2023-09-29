package pack;

public class MultiLevelInheritance2 extends  MultiLevelInheritance1{
	String b="Multi Level Inheritance Class2";
	public void runB()
	{
		System.out.println("Run B");
	}
	public static void main(String[] args) {
		 MultiLevelInheritance2 m=new  MultiLevelInheritance2();
		 m.runA();
		 m.runB();
System.out.println(m.a);
System.out.println(m.b);

	}
}
