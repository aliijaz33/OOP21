
public class Person {
    protected String name;
    protected String addres;
    protected String phoneNo;
    protected String email;
    
    public Person(String name, String addres, String phoneNo, String email){
        this.name = name;
        this.addres = addres;
        this.phoneNo = phoneNo;
        this.email = email;
    }
    

    public void display() {
        System.out.println("Name is: "+name+"\nAddres is: "+addres+"\nPhoneNumber is: "+phoneNo+"\nEmail is: "+email);
    }

}
