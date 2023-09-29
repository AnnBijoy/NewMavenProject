package pack;

public class Test implements Printable,Show {
	@Override
	public void printA() {
		System.out.println("Printing....");
		}
	@Override
	public void show() {
		System.out.println("Show....");
		
	}

	
	public static void main(String[] args) {
		Printable p =new Test();
		p.printA();
		Show s=new Test();
		s.show();
		Test t =new Test();
		t.printA();
		t.show();

	}
	

}
