

class animal {
    void run(){
        System.out.println("running");
        
    }
    
    
}class dog extends animal{
    void eat(){
        System.out.println("eating");
    }
}
class pup extends dog{
    void sleep(){
        System.out.println("sleeping");
    }
}

public class mli {
    public static void main(String[] args) {
        
        pup p =new pup();
    p.eat();
    p.sleep();
    p.run();
    }
    
}
