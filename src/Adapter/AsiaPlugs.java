package Adapter;

public class AsiaPlugs {
	private double size;
	
	public AsiaPlugs(double size) {
		this.size = size;
	}
	
	public double getSize() {
		return size;
	}
	
	public boolean fits(IndiaPlug indiaPlug) {
		boolean doesFit;
		doesFit = this.getSize() >= indiaPlug.getSize();
		return doesFit;
	}

}
