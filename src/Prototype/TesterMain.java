package Prototype;

public class TesterMain {

    //Tiene como proposito clonarse a si misma
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle();
        vehicle1.doors=5;
        vehicle1.type="sedan";
        vehicle1.brand="kia";
        vehicle1.engine="electric";
        System.out.println(vehicle1);
try {
    Vehicle vehicleClone= vehicle1.clonar();
    vehicleClone.doors=4;
    vehicleClone.brand="Nissan";
    System.out.println(vehicleClone);

    Vehicle vehicleClone2= vehicleClone.clonar();
    vehicleClone2.doors=1;
    System.out.println(vehicleClone2);

}catch (CloneNotSupportedException e){
    System.out.println("No se puede clonar "+e.getMessage());
}





    }


}
