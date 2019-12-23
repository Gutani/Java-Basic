package entities;


public class Employee {
	
	private String name;
	private Integer id;
	private Double salary;
	
	public Employee() {
	}
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}

	public void Increase(double percent) {
		salary += salary*percent/100;
	}
	public String toString() {
		return "Nome: " + name + ", ID: " + id + ", Salary: " + salary;
	}
	
}
