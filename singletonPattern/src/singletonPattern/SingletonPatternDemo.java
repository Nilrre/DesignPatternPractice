package singletonPattern;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
		
		SingleObject object2 = SingleObject.getInstance();
		object2.setMessage("This message was set in object 2");
		
		object2.showMessage();
		object.showMessage();
	}
}
