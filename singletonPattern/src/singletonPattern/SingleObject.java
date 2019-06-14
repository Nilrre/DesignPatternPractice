package singletonPattern;

public class SingleObject implements SingletonInterface{
	private static SingleObject instance = new SingleObject();
	private String message = "Hello World!";
	
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println(message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
