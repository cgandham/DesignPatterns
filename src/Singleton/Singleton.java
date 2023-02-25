package Singleton;

public final class Singleton{
	
	//single static instance
	private static Singleton instance;
	
	public String value;
	
	//use a private constructor
	private Singleton(String value) {
		try {
			this.value = value;
		}
		catch (Exception ex) {
			
		}
	}
	
	public static Singleton getInstance(String value) {
		if(instance == null) {
			instance = new Singleton(value);
		}
		return instance;
	}
}