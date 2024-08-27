/**
 * method_overloaddop
 */
public class method_overloadsop {
    void add(int a ,double b){
        System.out.println(a+b);
    }
    void add(double a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        method_overloadsop sop= new method_overloadsop();
        sop.add(4.5,45 );
        sop.add(45,4.5);
    }

    
}