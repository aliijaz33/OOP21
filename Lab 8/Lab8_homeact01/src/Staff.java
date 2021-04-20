
public class Staff extends Employee {
    private String title;
    
    public static void main(String[] arg){
        Date d1 = new Date(31, 12, 2000);
        Staff s = new Staff("Ali Ijaz", "House number 33D Gulbarg IsL", "03076511353", "ali6511353@gmail.com","E76D", 55000, d1, "Accountant");
        s.display();
    }
    
    public Staff(String name, String addres, String phoneNo, String email, String office, double salary, Date obj, String title){
        super(name, addres, phoneNo, email, office, salary, obj);
        this.title = title;
    }
    
    @Override
    
    public void display(){
        System.out.println("Staff Member's Details: ");
        super.display();
        System.out.println("Title is: "+title);
    }
    
}
