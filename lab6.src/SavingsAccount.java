
public class SavingsAccount {
    private static double AnnualInterestRate;
    private double SavingsBalance;
    
    public SavingsAccount(double SavingsBalance){
        
        this.SavingsBalance = SavingsBalance;
    }
    
    public double CalculateMonthlyInterestRate(){
        
        return ((SavingsBalance * AnnualInterestRate)/12);
    }
    
    public static void ModifyInterestRate(double NewAnnualInterestRate){
        
        System.out.println("The Annual Interest Rate is: " +NewAnnualInterestRate+ "%");
        AnnualInterestRate = NewAnnualInterestRate/100;
    }
    
    public void print(){
        
        System.out.printf("New balance includilg monthly profit: %.1f " , (SavingsBalance + CalculateMonthlyInterestRate()));
        System.out.println();
    }
}
