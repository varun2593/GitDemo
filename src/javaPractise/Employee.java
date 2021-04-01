package javaPractise;

public class Employee extends Person {
	private String title;
	private String employer;
	private String employeeGrade;
	private int salary;

	public Employee(String title, String employer, String employeeGrade, int salary) {
		super();
		this.title = title;
		this.employer = employer;
		this.employeeGrade = employeeGrade;
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return String.format("name = %s, phone= %d, email= %s, title= %s, employer= %s, employeeGrade= %s, salary= %d", getName(),
				getPhone(), getEmail(), title, employer, employeeGrade, salary);
	}

}
