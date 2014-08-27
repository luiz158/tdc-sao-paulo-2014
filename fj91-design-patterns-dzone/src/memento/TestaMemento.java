package memento;

import strategy.FileWriterUtil;

public class TestaMemento {

	public static void main(String[] args) {
		FileWriterUtil fileWriterUtil = new FileWriterUtil("myFile.txt");
		Caretaker caretaker = new Caretaker(fileWriterUtil);
		
		caretaker.write("First line");
		caretaker.save();
		System.out.println(fileWriterUtil);
		
		caretaker.write("Second line");
		caretaker.save();
		System.out.println(fileWriterUtil);
		
		caretaker.write("Third line");
		System.out.println(fileWriterUtil);
		
		caretaker.undoToLastSave();
		System.out.println(fileWriterUtil);
	}
}
