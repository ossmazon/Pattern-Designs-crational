package builder;


//permite contruir objetos complejos poco a poco
public class TesterMain {
    public static void main(String[] args) {

        Vehicle vehicle2 =new VehicleBuilder("Kia").setDoors(4).setEngine("Electric").setType("Sedan").build();
        System.out.println(vehicle2);

    }
}
