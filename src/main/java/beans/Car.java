package beans;

public class Car {
	private String make;
	private Engine engine;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", engine=" + engine.getYear() + "]";
	}
	
	
}
