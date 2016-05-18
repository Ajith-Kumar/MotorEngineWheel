
public class MotorVehicle {

	private EngineClass engine;
	private WheelClass wheels;
	private String rego;
	private int numPassengers;
	
	public MotorVehicle(){
		
		engine = new EngineClass();
		wheels = new WheelClass();
		rego = new String();
		numPassengers = 2;
		
	}
	
	public MotorVehicle(Object inEngine, Object inWheels, String inRego, int inNumPassengers){
		
		if(inEngine == null){
			throw new IllegalArgumentException("Invalid Engines");
		} else if (inWheels == null){
			throw new IllegalArgumentException("Invalid Wheels");
		} else if (inRego == null){
			throw new IllegalArgumentException("Invalid Registration No.");
		} else if (inNumPassengers <= 0){
			throw new IllegalArgumentException("Invalid Passenger");
		}
		
		engine = new EngineClass(inEngine);
		
	}
	
}
