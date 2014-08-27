package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

	private List<Employee> employees = new ArrayList<>();
	
	private String name;
	
	private Double salary;
	
	public Manager(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		this.employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		this.employees.remove(employee);
	}

	@Override
	public Employee getChild(int position) {
		return this.employees.get(position);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Double getSalary() {
		return this.salary;
	}

	@Override
	public void print() {
		System.out.println("---------------------");
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
		System.out.println("---------------------");
		
		for (Employee employee : this.employees) {
			employee.print();
		}
	}

}
