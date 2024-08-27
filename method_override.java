class vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}
/**
 * method_override
 */
 class bike extends vehicle {
    void run(){
        System.out.println("bike is running");
    }
 public static void main(String[] args) {
    bike b = new bike();
    b.run();
    vehicle v= new vehicle();
    v.run();
    
}
    
}