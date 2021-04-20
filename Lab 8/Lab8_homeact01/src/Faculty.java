
public class Faculty extends Employee {
    private int officeHour;
    private String rank;
    
    public Faculty(String name, String addres, String phoneNo, String email, String office, double salary, Date obj, int officeHour, String rank){
        super(name, addres, phoneNo, email, office, salary, obj);
        this.officeHour = officeHour;
        this.rank = rank;
    }
    
    @Override
    public void display(){
        System.out.println("\nFaculty Member's Details: ");
        super.display();
        System.out.println("Office Hours: "+officeHour+"\nRank: "+rank);
    }
}
