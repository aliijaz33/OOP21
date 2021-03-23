
public class Distance_Class {
    private int feet;
    private int inches;
    
    public Distance_Class()
    {
        feet = 100;
        inches = 12;
    }
    public Distance_Class(int feet, int inches)
    {
        this.feet = feet;
        this.inches = inches;
    }
    public Distance_Class addDistances(Distance_Class a)
    {
        Distance_Class O1 = new Distance_Class(feet + a.feet, inches + a.inches);
        return O1;
    }
    public int getFeet()
    {
        return feet;
    }
    public int getInches()
    {
        return inches;
    }
    public void setter(int feet, int inches)
    {
        this.feet = feet;
        this.inches = inches;
    }
    public void display()
    {
        System.out.println("After adding distance\nFeets = "+ getFeet() +"\nInches = "+ getInches());
    }
}