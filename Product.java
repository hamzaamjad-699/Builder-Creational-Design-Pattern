package BuilderDesign;

public class Product {
	private String vehicle_name;

	Product(String name){
		this.vehicle_name= name;
	}
	void showProduct(){
		System.out.println("Showing "+vehicle_name);
	}
}
