package strategy;

public class FileWriterUtil {

	private StringBuilder content;
	
	private String fileName;
	
	public FileWriterUtil(String fileName) {
		this.fileName = fileName;
		this.content = new StringBuilder();
	}
	
	@Override
	public String toString() {
		return content.toString();
	}
	
	public void write(String text) {
		content.append(text + "\n");
	}
	
	public Object save() {
		Memento memento = new Memento(this.fileName, new StringBuilder(content));
		return memento;
	}
	
	public void undo(Object obj) {
		Memento memento = (Memento) obj;
		this.fileName = memento.fileName;
		this.content = memento.content;
	}

	private class Memento {
		
		private String fileName;
		
		private StringBuilder content;
		
		public Memento(String fileName, StringBuilder text) {
			this.fileName = fileName;
			this.content = text;
		}
	}
	
}
