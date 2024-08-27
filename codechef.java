import java.util.Scanner;

public class codechef {

   public static void main(String[] args) {
    
   


    Scanner sc= new Scanner(System.in);
        int  s1 = sc.nextInt();
        if(s1>90){
            System.out.println("A");
        }
        else if(s1<90&&s1>70){
            System.out.println("B");
        }
        else if(s1<70&&s1>=40){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }
        
        Scanner a= new Scanner(System.in);
        int  s2 = a.nextInt();
        if(s2>90){
            System.out.println("A");
        }
        else if(s2<90&&s2>70){
            System.out.println("B");
        }
        else if(s2<70&&s2>=40){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }
        
        Scanner b= new Scanner(System.in);
        int  s3 = b.nextInt();
        if(s3>90){
            System.out.println("A");
        }
        else if(s3<90&&s3>70){
            System.out.println("B");
        }
        else if(s3<70&&s3>=40){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }
   }
}
