
public class EngineClass {

	public static final int MAXCYLINDERS = 16;
	
	private int numCyl;
	private double horsePower;
	private String fuelType;
	
	public EngineClass(){
		
		numCyl = 10;
		horsePower = 200.0;
		fuelType = "ULP";
		
		EngineClass eng = new EngineClass(8, 450.0, "ULP");
		EngineClass eng1 = new EngineClass(10, 450.0, "ULP");
		
		if(eng.equal(eng1)){
			System.out.println("The Engines are a match!");
			System.out.println(eng.toString());
		} else {
			System.out.println("Not a match");
		}
		
	}
	
	
	
	
	public EngineClass(EngineClass inEngine){
		numCyl = inEngine.getNumCylinders();
		horsePower = inEngine.getHorsePower();
		fuelType = inEngine.getFuelType();
	}
	
	
	public EngineClass(int inNumCyl, double inHorsePow, String inFuelType){
		
		if(!validCyl(inNumCyl)){
			throw new IllegalArgumentException("Invalid Cylinders");
			
		} else if (!validHorse(inHorsePow)){
			
			throw new IllegalArgumentException("Invalid Horse Power");
		}
		
		else if (!validFuel(inFuelType)){
			throw new IllegalArgumentException("Invalid Fuel Type");
		}
		
		numCyl = inNumCyl;
		horsePower = inHorsePow;
		fuelType = inFuelType;
		
	}
	
	
	
	private boolean validCyl(int m){
		boolean isValid = false;
			
		if ((m >= 4) && (m % 2 == 0)){
			
		} else {
			isValid = false;
		}
		
		return isValid;
	}
	
	public boolean validHorse(double n){
		boolean isValid = false;
		
		if((n > 0.0) && (n < 640.0)){
			isValid = true;
		} else {
			isValid = false;
		}
		
		return isValid;
	}
	
	private boolean validFuel(String inFuelType){
		boolean isValid = false;
		
		if(inFuelType.equals("ULP") || inFuelType.equals("98RON") || inFuelType.equals("PULP") 
				|| inFuelType.equals("DIESEL") || inFuelType.equals("LPG") ){
			isValid = true;
		}
		
		return isValid;
	}
	
	public boolean realSame(double n, double m){
		boolean isSame = false;
		
		if(Double.compare(n, m) == 0){
			isSame = true;
		} else {
			isSame = false;
		}
		
		return isSame;
	}
	
	
	
	public int getNumCylinders(){
		return numCyl;
	}
	
	public double getHorsePower(){
		return horsePower;
	}
	
	public String getFuelType(){
		return fuelType;
	}
	
	public void setNumCylinders(int inNumCylinder){
		if(!((inNumCylinder >= 4) && (inNumCylinder <= MAXCYLINDERS) && (inNumCylinder % 2 == 0))){
			throw new IllegalArgumentException("Invalid Cylinders");
		} 
		
		numCyl = inNumCylinder;
	}
	
	public void setHorsePower(double inHorsePower){
		
		if(! (inHorsePower > 0.0 && inHorsePower < 640.0)  ){
			throw new IllegalArgumentException("Invalid Horse Power");
		}
		
		horsePower = inHorsePower;
		
	}
	
	public void setFuelType(String inFuelType){
		
		if(!validFuel(inFuelType)){
			throw new IllegalArgumentException("Invalid Fuel Type");
		}
		
		fuelType = inFuelType;
		
	}
	
	public boolean equal(Object inObject){
		
		boolean isEqual = false;
		EngineClass inEngine = null;
		
		if(inObject instanceof EngineClass){
			if(numCyl == inEngine.getNumCylinders()){
				if(realSame(horsePower, inEngine.getHorsePower())){
					if(fuelType.equals(inEngine.getFuelType())){
						isEqual = true;
					}
				}
			}
		}
			
		return isEqual;
		
	}
	
	public String toString(){
		
		String engineString;
		engineString = ("This Engine has: " + numCyl + " With " + horsePower + " and uses " + fuelType );
		
		return engineString;
		
	}
	
}




