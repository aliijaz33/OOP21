
public class Pizza {
    private String size;
    private int cheezeToppings;
    private int pepperoniToppings;
    private int hamToppings;
    
    public Pizza(String size, int cheezeToppings, int pepperoniToppings, int hamToppings){
        
        this.size = size;
        this.cheezeToppings = cheezeToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }
    
    public void setSize (String size){
        
        this.size = size;
    }
    
    public void setCheezeToppings (int cheezeToppings){
        
        this.cheezeToppings = cheezeToppings;
    }
    
    public void setPepperoniToppings (int pepperoniToppings){
        
        this.pepperoniToppings = pepperoniToppings;
    }
    
    public void setHamToppings (int hamToppings){
       
        this.hamToppings = hamToppings;
    }
    
    public String getSize(){
        
        return size;
    }
    
    public int getCheezeToppings(){
        
        return cheezeToppings;
    }
    
    public int getPepperoniToppings(){
        
        return pepperoniToppings;
    }
    
    public int getHamToppings(){
        
        return hamToppings;
    }
    
    public double calcCost(){
        
        int cost = 0;
        if (getSize() == "Small")
            cost = 10 + 2*(getCheezeToppings() + getPepperoniToppings() + getHamToppings());
        else if (getSize() == "Medium")
            cost = 12 + 2*(getCheezeToppings() + getPepperoniToppings() + getHamToppings());
        else if (getSize() == "Large")
            cost = 14 + 2*(getCheezeToppings() + getPepperoniToppings() + getHamToppings());
        
        return cost;
    }
    
    public String getDescription(){
        return "Pizza Size: " +getSize()+ "\nCheeze Toppings: "+getCheezeToppings()+ "\nPepperoni Toppings" +getPepperoniToppings()+ "\nHam Toppings: "+getHamToppings();
    }
}
