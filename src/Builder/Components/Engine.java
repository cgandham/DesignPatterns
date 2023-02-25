package Builder.Components;

public class Engine {
	private final double volume;
    private double mileage;
    
    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public double getVolume() {
		return volume;
	}
}
