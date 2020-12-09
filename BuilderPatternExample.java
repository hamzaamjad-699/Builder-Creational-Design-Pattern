package BuilderDesign;

//The common interface
interface Builder
{
   void startUpOperations();
   void buildBody();
   void insertWheels();
   void addHeadlights();
   void  endOperations();
   /*The following method is used to retrieve the object that is constructed.*/
   Product getVehicle();
}


public class BuilderPatternExample {

	public static void main(String[] args) {
		System.out.println("***Builder Pattern Demo***");
		Director director = new Director();
		
		Builder fordCar = new Car("Ford");
		Builder hondaMotorcycle = new Motorcycle("Honda");

		// Making Car
		director.construct(fordCar);
		Product p1 = fordCar.getVehicle();
		p1.showProduct();
	              
		//Making MotorCycle
		director.construct(hondaMotorcycle );
		Product p2 = hondaMotorcycle.getVehicle();
		p2.showProduct();
	}
}
