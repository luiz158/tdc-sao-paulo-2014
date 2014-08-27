package composite;

public interface Employee {

	void add(Employee employee);
	
	void remove(Employee employee);
	
	Employee getChild(int posicion);
	
	String getName();
	
	Double getSalary();
	
	void print();
}
