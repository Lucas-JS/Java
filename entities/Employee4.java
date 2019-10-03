package entities;

public class Employee4 implements Comparable<Employee4>{

	private String name;
	private Double salary;
	
	public Employee4(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee4 other) {
		return name.compareTo(other.getName());
	}
	
	
	
}
