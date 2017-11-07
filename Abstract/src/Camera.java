public class Camera extends Machine {
    public void start(){
        System.out.println("Starting camera.");
    }

    public void doStuff(){
        System.out.println("Taking a photo");
    }
    public void shutdown(){
        System.out.println("Shutting down the camera.");
    }
}
