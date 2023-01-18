package builder;

public class VehicleBuilder {
    Vehicle vehicle;
    public VehicleBuilder(String brand) {
        vehicle = new Vehicle();
        vehicle.setBrand(brand);
    }

    public VehicleBuilder setDoors(int doors) {
        vehicle.setDoors(doors);
        return this;
    }
    public VehicleBuilder setEngine(String engine) {
        vehicle.setEngine(engine);
        return this;
    }
    public VehicleBuilder setType(String type) {
        vehicle.setType(type);
        return this;
    }

    public Vehicle build(){
        return this.vehicle;
    }
}
