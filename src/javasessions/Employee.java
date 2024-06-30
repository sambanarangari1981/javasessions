package javasessions;

public class Employee {
	
	//data members;
		//class variables
		String name;
		int age;
		double salary;
		boolean isperm;

	public static void main(String[] args) {
		
		//create the object of Employee class: using new keyword
		
		Employee obj = new Employee();
		
		Employee e1 = new Employee();
		
		//no reference objects is not recommended
		new Employee().name = "Samba";
		
				
		
	}

}
