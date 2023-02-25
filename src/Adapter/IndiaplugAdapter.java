package Adapter;

public class IndiaplugAdapter extends IndiaPlug {
	IndiaplugAdapter(double size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	private IndiaPlug indiaPlug;
	
//	public IndiaplugAdapter(IndiaPlug size) {
//		this.indiaPlug = size;
//	}
	
	public double getSize() {
		 double result;
	    result = indiaPlug.getSize() * 2;
	    return result;
	}
	
	

}
