package javaPractise;

public class PersonRunner {

	public static void main(String[] args) {
		Employee emp = new Employee("Mr","TCS","A",10000);
		
		emp.setName("Varun");
		emp.setEmail("varun2593@yahoo.com");
		emp.setPhone(9988);
		
		System.out.println(emp);

	}

}
