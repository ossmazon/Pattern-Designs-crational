package factory;

public class PriceFactory {
    Price price;
    private PriceFactory(){

    };
    public PriceFactory(String country){
        if (country.equalsIgnoreCase("France")){
            System.out.println("France, price in EUR");
            this.price=new PriceEUR();
        }else if (country.equalsIgnoreCase("UK")){
            System.out.println("We are in the UK");
            this.price=new PriceGBP();
        }
        else{
            System.out.println("An other country, price in USd");
            this.price=new PriceUSD();
        }


    }
    public  double getPrice(){
        return price.getPrice();
    }
}
