package composite;

//Developer class is a leaf in the Composite Component
public class Developer implements Employee {
	
	private String name;
	
	private Double salary;

	public Developer(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		// empty
	}

	@Override
	public void remove(Employee employee) {
		// empty
	}

	@Override
	public Employee getChild(int posicion) {
		return null; // Developer has no Leaf
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
	}

}
