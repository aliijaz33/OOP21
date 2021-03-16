
package lab4_ass;


public class Lab4_ass {

   
    public static void main(String[] args)
    {
             Lab4_ass_class H1 = new Lab4_ass_class(420, 10);
        Lab4_ass_class H2 = new Lab4_ass_class(522, 20);
        Lab4_ass_class H3 = new Lab4_ass_class(333, 30);
        
        H1.Sold();
        H2.Sold();
        H3.Sold();
        
        System.out.println("HOT DOGS STAND No.:\t" + H1.Hot_Dogs_stands_no() + "\nTotal sold:\t" + H1.Hot_Dogs_sold() + "\n\n");
        
        System.out.println("HOT DOGS STAND No.:\t" + H2.Hot_Dogs_stands_no() + "\nTotal sold:\t" + H2.Hot_Dogs_sold() + "\n\n");
        
        System.out.println("HOT DOGS STAND No.:\t" + H3.Hot_Dogs_stands_no() + "\nTotal sold:\t" + H3.Hot_Dogs_sold() + "\n\n");
    
    }
    
}
