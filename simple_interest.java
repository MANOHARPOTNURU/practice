import java.util.*;
public class simple_interest {
   
public static void main(String[] args) {
    float p,r,SI;
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("enter p :");
    p = sc.nextFloat();
    System.out.print("enter n :");
    n= sc.nextInt();
    System.out.print("enter r :");
    r= sc.nextFloat();
    SI= (p*n*r)/100;
    System.out.print("interst is "+SI);

}

}
