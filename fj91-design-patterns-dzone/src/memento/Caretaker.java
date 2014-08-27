package memento;

import strategy.FileWriterUtil;

public class Caretaker {

	private Object obj;
	
	private FileWriterUtil fileWriterUtil;
	
	public Caretaker(FileWriterUtil fileWriterUtil) {
		this.fileWriterUtil = fileWriterUtil;
	}

	public void write(String text) {
		fileWriterUtil.write(text);
	}

	public void save() {
		this.obj = fileWriterUtil.save();
	}

	public void undoToLastSave() {
		fileWriterUtil.undo(obj);
	}

}
