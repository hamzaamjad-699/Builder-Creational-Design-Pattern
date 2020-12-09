package BuilderDesign;

public class Director {
    public void construct(Builder vehicle){
        vehicle.startUpOperations();
        vehicle.buildBody();
        vehicle.insertWheels();
        vehicle.addHeadlights();
        vehicle.endOperations();

}
}
