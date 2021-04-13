
public class Lab7_RunnerClass {

    
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Large", 1, 2, 2);
        Pizza p2 = new Pizza("Medium", 2, 1, 2);
        Pizza p3 = new Pizza("Small", 1, 2, 1);
        
        PizzaOrder order1 = new PizzaOrder(p1, p2, p3);
        
        System.out.println("Total Cost is: " +order1.totalCost()+"$");
    }
    
}
