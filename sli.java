
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
class sli{
    public static void main(String[] args) {
        dog d =new dog();
        d.eat();
        d.run();
    }
}
