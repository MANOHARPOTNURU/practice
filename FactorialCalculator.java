import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize variables
        int result = 1;
        int i = number;
        
        // Do-while loop to calculate factorial
        do {
            result *= i;
            i--;
        } while (i > 0);
        
        // Output the result
        System.out.println(result);
        
        scanner.close();
    }
}
