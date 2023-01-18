package singleTon;

public class TesterMain {


    //solo puede haber una instancia de una clase
    //mecanismo principal asegurarse que una clase solo cree una instancia

    public static void main(String[] args) {

        //hacen referencia a la misma instancia de clase
        SingleTon singleTon= SingleTon.getInstance();
        singleTon.setCount(5);
        System.out.println("Valor: "+singleTon.getCount()+" en memoria: "+singleTon);


        SingleTon singleTon2= SingleTon.getInstance();
        singleTon2.setCount(5);
        System.out.println("Valor: "+singleTon2.getCount()+" en memoria: "+singleTon2);



        Application app1 =Application.getInstance();
        Application app2 =Application.getInstance();
        app1.Run();
        app2.Run();
        System.out.println(app1+" "+app2);





    }
}
