package singleTon;

 class SingleTon {

     private static SingleTon singleTon;
     private int count;

     //este constructor permite que solo getInstace() pueda crear nuevas instancias de  SingleTon
     private SingleTon() {}
     public static SingleTon getInstance() {
         if (singleTon==null){

             singleTon = new SingleTon();
         }
        return singleTon;
     }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }




}
