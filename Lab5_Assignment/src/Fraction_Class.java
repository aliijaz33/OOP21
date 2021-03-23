import java.util.*;
public class Fraction_Class {
    
    Scanner s = new Scanner(System.in);
    double num1;
    double num2;
    
    Fraction_Class(){
        num1 = 5;
        num2 = 3;
        
    }
    Fraction_Class(double num1, double num2){
    
        this.num1 = num1;
        this.num2 = num2;
        
    }
    public void set(int num1, int num2){
        
        this.num1 = num1;
        this.num2 = num2;
    }
    public double get(){
    
        double x = (num1/num2);
        return x;
    }
    public boolean equals(){
    
        System.out.println("This Fraction is : "+ (int)num1 + ":" + (int)num2 );
        System.out.println("Enter two no.");
        double x = s.nextDouble();
        double y = s.nextDouble();
        Fraction_Class f = new Fraction_Class(x , y);
        if (get() == f.get())
            return true;
        
        else
            return false;
    
    }
    public void display(){
    
        if (equals()){
        
            System.out.println("These two Fractions are identical");
        }
        else
            System.out.println("These two Fractions are not identical");
    }
}
