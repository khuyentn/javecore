public class Car extends Machine{
    public void start(){
        System.out.println("Starting ignition.");
    }

    public void doStuff(){
        System.out.println("Driving");
    }
    public void shutdown(){
        System.out.println("Switch off ignition.");
    }
}
