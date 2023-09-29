package pack;

public class MultiLevelInheritance3 extends MultiLevelInheritance2{
	String c="Multi Level Inheritance Class3";
	public void runC()
	{
		System.out.println("Run C");
	}
	public static void main(String[] args) {
		 MultiLevelInheritance3 v=new  MultiLevelInheritance3();
		 v.runA();
		 v.runB();
		 v.runC();
System.out.println(v.a);
System.out.println(v.b);
System.out.println(v.c);
	}

}
