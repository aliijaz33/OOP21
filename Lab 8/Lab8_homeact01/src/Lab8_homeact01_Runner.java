
public class Lab8_homeact01_Runner {

    
    public static void main(String[] args) {
        Student std = new Student("Azhar ali", "House number 43D Gulbarg IsL", "03087612345", "azhar786@gmail.com", "graduate");
        std.display();
        
        Date d2 = new Date(30, 5, 2021);
        Faculty f = new Faculty("Azhar ali", "House number 43D Gulbarg IsL", "03087612345", "azhar786@gmail.com", "DC34B",45000, d2, 8,"office Member");
        f.display();
        
        Date d3= new Date(31, 6, 2000);
        Staff st = new Staff("Ali Ijaz", "House number 33D Gulbarg IsL", "03076511353", "ali6511353@gmail.com","E76D", 55000, d3, "Accountant");
        st.display();
    }
    
}
