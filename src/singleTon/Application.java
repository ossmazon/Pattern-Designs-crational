package singleTon;

public class Application {
    //aplication in a real context
    boolean isRunning = false;
    private static Application application;
    private Application(){

    }
    public static Application getInstance(){
        if (application==null){

            application=new Application();
        }

        return application;
    }
    public void Run() {
        if (!isRunning) {
            System.out.println("running");
            isRunning = true;
        }else{
            System.out.println("It's all ready running");
        }

    }
}
