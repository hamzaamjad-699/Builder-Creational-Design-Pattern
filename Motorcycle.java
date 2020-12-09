package BuilderDesign;

public class Motorcycle implements Builder{
	private Product product;

    Motorcycle(String name){
        this.product = new Product(name);
    }

	@Override
	public void startUpOperations() {
		// TODO Auto-generated method stub
		System.out.println("Motorcycle has started its operation");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		System.out.println("The process of building the Motorcycle hass been started");
		
	}

	@Override
	public void insertWheels() {
		// TODO Auto-generated method stub
		System.out.println("The wheels are inserted in the Motorcycle");
		
	}

	@Override
	public void addHeadlights() {
		// TODO Auto-generated method stub
		System.out.println("Headlights of the Motorcycle has also been installed");
		
	}

	@Override
	public void endOperations() {
		// TODO Auto-generated method stub
		System.out.println("All of the operations of the Motorcycle has finished");
		
	}

	@Override
	public Product getVehicle() {
		// TODO Auto-generated method stub
		return product;
	}
	
}
