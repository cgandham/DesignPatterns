package Adapter;

public class USplug implements Plugs {
	private double size;
	
	USplug(double size){
		this.size = size;
	}

	@Override
	public void charge(String plugType) {
		System.out.println("CHARGE US");
		
	}
	
	public double getSize() {
		return this.size;
	}

}
