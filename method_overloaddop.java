public class method_overloaddop {
    void add(int a , double b){
        System.out.println(a+b);
    }
    void add(double a ,double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        method_overloaddop dop =new method_overloaddop();
        dop.add(4.5,4.5);
        dop.add(45,4.5);
    }
    
}
