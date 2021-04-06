
import java.util.*;


public class Calculator {
    static Scanner sc = new Scanner(System.in);
    
    public static void showManu(String[] s){
        
        for(int i=0; i<s.length; i++)
        {
            System.out.println((i+1) + " : "+ s[i]);
        }
    }
    
    public static int getOption(){
        
        System.out.print("Select an option to perform an operation or putt 0 to exit: ");
        int option = sc.nextInt();
        return option;
    }
    
    public static void sum(){
        
        int sum = 0;
        System.out.println("\nEnter numbers to add and 0 for answer: "); 
        int num = sc.nextInt();
        while (num != 0)
        {
            sum += num;
            System.out.print("\r+ "); 
            num = sc.nextInt();         
        }
        System.out.println("Sum = "+ sum +"\n"); 
    }
    
    public static void multiply(){
        
        int ans = 1;
        System.out.println("\nEnter numbers to Multiply or 1 for answer: "); 
        int num = sc.nextInt();
        while (num != 1)
        {
            ans *= num;
            System.out.print("* "); 
            num = sc.nextInt();       
        }
        System.out.println("Answer = "+ ans +"\n");
    }
    
    public static void divide(){
        
        System.out.print("\nEnter numerator: "); 
        double numerator = sc.nextDouble();
        System.out.print("Enter denominator: "); 
        double denominator = sc.nextDouble();
        System.out.printf((int)numerator +" / "+ (int)denominator +" = %.2f ", (numerator/denominator));
        System.out.println();
        System.out.println();
    }
    
    public static void modulus(){
        
        System.out.print("\nEnter two numbers to find Modulus: "); 
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println((int)num1 +" % "+ (int)num2 +" = "+ (num1%num2) +"\n");
    }
    
    public static void sin(){
        
        System.out.print("\nEnter a numbers in Degrees to find Sin: "); 
        int num = sc.nextInt();
        System.out.printf("Sin("+ num +") = %.2f", Math.sin(Math.toRadians(num)));
        System.out.println();
        System.out.println();
    }
    
    public static void cos(){
        
        System.out.print("\nEnter a numbers in Degrees to find Cos: "); 
        int num = sc.nextInt();
        System.out.printf("Cos("+ num +") = %.2f", Math.cos(Math.toRadians(num)));
        System.out.println();
        System.out.println();
    }
    
    public static void tan(){
        
        System.out.print("\nEnter a numbers in Degrees to find tan: "); 
        int num = sc.nextInt();
        System.out.printf("tan("+ num +") = %.2f", Math.tan(Math.toRadians(num)));
        System.out.println();
        System.out.println();
    }
}
