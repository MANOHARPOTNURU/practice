public class method_overloadnop {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        method_overloadnop nop = new method_overloadnop();
        nop.add(4, 5);
        nop.add(4,5,0);
        
    }
}
