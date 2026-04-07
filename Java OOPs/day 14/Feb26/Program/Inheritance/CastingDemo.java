class FourWheeler
{
	public void driveVehicle()
	{
		System.out.println("Driving vehicle");
	}
}

class Car extends FourWheeler
{
	public void driveCar()
	{
		System.out.println("Driving car");
	}
}

class CastingDemo
{
	public static void main(String args[])
	{
		FourWheeler fw; 
		Car car = new Car();
		
		//fw = car;			//OK;
		fw = (FourWheeler)car;		//OK; Upcasting (parnt  = child); Casting not mandatory
		fw.driveVehicle();
		((Car)fw).driveCar();
		
		car = (Car)fw;			//OK; Downcasting (child ref = parent ref)
		car.driveCar();
		
		FourWheeler fw1 = new FourWheeler();
		Car car1 = null;
		
		car1 = (Car)fw1;			//Car reference = FourWheeler object ==> ERROR				
		
	}
}


