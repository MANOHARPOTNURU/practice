import java.util.*;
public class calculator {
    public static void main(String[] args) {
        int choice;
        float a,b,r;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a :");
        a=sc.nextFloat();
        System.out.println("enter b :");
        b=sc.nextFloat();
        System.out.println("enter your choice :");
        choice =sc.nextInt();
        switch(choice){


            case 1 : r=a+b;
            System.out.println("result :"+r);
            break;
            case 2 : r=a-b;
            System.out.println("result :"+r);
            break;
            case 3 : r=a*b;
            System.out.println("result :"+r);
            break;
            case 4 : r=b/a;
            System.out.println("result :"+r);
            break;
            case 5 : r=a/b;
            System.out.println("result :"+r);
            break;
            case 6 : r=a%b;
            System.out.println("result :"+r);
            break;
            default : System.out.println("enter valid choice");






        }
        

        

        
    }
    
}
