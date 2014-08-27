package composite;

public class TestCompositePattern {

	public static void main(String[] args) {
		Manager cto = new Manager("David", 20.000);
		cto.add(new Developer("Gama", 15.000));
		
		Manager andre = new Manager("Andre", 18.000);
		cto.add(andre);
		
		andre.add(new Developer("Erich", 25.000));
		andre.add(new Developer("Sival", 15.000));
		
		cto.print();
	}
	
}
