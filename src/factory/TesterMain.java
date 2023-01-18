package factory;

public class TesterMain {

    //sirve para crear una jerarquia de clases y utilizar una u otra de forma transparente

    public static void main(String[] args) {

        PriceFactory france=new PriceFactory("france");
        System.out.println(france.getPrice());

        PriceFactory usa=new PriceFactory("usa");
        System.out.println(usa.getPrice());

        PriceFactory uk=new PriceFactory("uk");
        System.out.println(uk.getPrice());


    }
}
