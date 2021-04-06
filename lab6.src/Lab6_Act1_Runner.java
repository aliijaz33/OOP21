
public class Lab6_Act1_Runner {

    
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.ModifyInterestRate(3);
        saver1.print();
        saver2.print();
        System.out.println();
        SavingsAccount.ModifyInterestRate(4);
        saver1.print();
        saver2.print();
    }
    
}
