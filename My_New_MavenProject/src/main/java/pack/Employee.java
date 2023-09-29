package pack;

public class Employee {
	int id;
	String name;
	Address address;
	public Employee(int id, String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display() {
		System.out.println("ID IS: "+id+"\n"+"NAME: "+name);
		System.out.println("CITY: "+address.city+"\n"+"STATE: "+address.state+"\n"+"COUNTRY: "+address.country);
	}

	public static void main(String[] args) {

		Address adr1=new Address("TVM", "KERALA", "INDIA");
		Employee e=new Employee(1,"Anju",adr1);
		e.display();
		
		Address adr2=new Address("EKM", "KERALA", "INDIA");
		Employee e1=new Employee(2,"Anu",adr2);
		e1.display();

	}

}
