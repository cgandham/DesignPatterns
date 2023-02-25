package Adapter;

public class IndiaPlug implements Plugs {
	private double size;
	
	IndiaPlug(double size){
		this.size = size;
	}
	

	@Override
	public void charge(String plugType) {
		System.out.println("CHARGE India");
	}
	
	public double getSize() {
		return this.size;
	}

}
