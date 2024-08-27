class animal {
    void run(){
        System.out.println("running");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("eating");
    }
}
class cat extends animal{
    void sleep(){
        System.out.println("sleeping");
    }
}


public class heirarchy {
    public static void main(String[] args) {
        dog d= new dog();
        d.eat();
        d.run();
        cat c= new cat();
        c.sleep();
        c.run();
        
    }
    
}
