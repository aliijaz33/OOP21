
public class Student extends Person{
    private String status;
    
    public Student(String name, String addres, String phoneNo, String email, String status){
        super(name, addres, phoneNo, email);
        this.status = status;
    }
    
    @Override
    
    public void display(){
        System.out.println("\nStudent's Details: ");
        super.display();
        System.out.println("Status is: "+status);
    }
    
}
