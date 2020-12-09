package BuilderDesign;
public class Car implements Builder{
	private Product product;
	
	Car (String name){
		this.product= new Product(name);
	}
	@Override
	public void startUpOperations() {
		// TODO Auto-generated method stub
		System.out.println("Car has started its operation");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		System.out.println("The process of building the car hass been started");
		
	}

	@Override
	public void insertWheels() {
		// TODO Auto-generated method stub
		System.out.println("The wheels are inserted in the car");
		
	}

	@Override
	public void addHeadlights() {
		// TODO Auto-generated method stub
		System.out.println("Headlights of the car has also been installed");
		
	}

	@Override
	public void endOperations() {
		// TODO Auto-generated method stub
		System.out.println("All of the operations of the car has finished");
		
	}

	@Override
	public Product getVehicle() {
		// TODO Auto-generated method stub
		return product;
	}
	
}
