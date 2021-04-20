
public class Employee extends Person{
    
    protected String office;
    protected double salary;
    protected Date hireDate;
    
    public Employee(String name, String addres, String phoneNo, String email, String office, double salary, Date obj){
        super(name, addres, phoneNo, email);
        this.office = office;
        this.salary = salary;
        this.hireDate =obj;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Office no: "+office+"\nsalary: "+salary+"\\nHire Date"+hireDate);
    }
    
}

class Date{
    int year;
    int month;
    int day;
    
    public Date(int d, int m, int y){
        year = y;
        month = checkMonth(m);
        day = checkday(d);
    }
    
    public int checkMonth(int m){
        if (m>=1 && m<= 12)
            return m;
        else
            return 1;
    }
    
    public int checkday(int d){
        int[] arr = {1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (d>=1 && d<= arr[month])
            return d;
        else
            return 1;
    }
    public String toString(){
        String st = day+"-"+month+"-"+year;
        return st;
    }
}
