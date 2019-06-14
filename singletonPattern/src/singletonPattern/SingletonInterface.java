package singletonPattern;

public interface SingletonInterface {
	
	static SingleObject getInstance() {
		return null;
	}
	
	void showMessage();
	
	void setMessage(String message);
}
