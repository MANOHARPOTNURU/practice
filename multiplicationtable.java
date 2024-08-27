import java.util.*;
class multiplicationtable

{

   public static void main(String a[])
   {
      int n,end;
      var s =new Scanner(System.in);
      System.out.println("enter the value of n :");
      n=s.nextInt();
      System.out.println("enter the end of table ");
      end = s.nextInt();
      System.out.println("multiplication table :");
      for(int i=1;i<end;i++){
        
        
        
         System.out.println(n+ " X " +i+ " = " + (n*i) );



      }


   }


}