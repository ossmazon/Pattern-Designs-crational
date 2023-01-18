package Prototype;

public class Vehicle implements Cloneable{

    public String brand;
    public String type;
    public String engine;
    public int doors;
    public Vehicle(){

    }
    public Vehicle clonar() throws CloneNotSupportedException {

        return (Vehicle)this.clone();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", engine='" + engine + '\'' +
                ", doors=" + doors +
                '}';
    }
}
