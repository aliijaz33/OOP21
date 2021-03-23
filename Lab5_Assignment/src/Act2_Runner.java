
public class Act2_Runner {

   
    public static void main(String[] args) {

        Book_Class B1 = new Book_Class();
        B1.setter("Shaikh_Hajjaz", 13);
        Book_Class B2 = new Book_Class("Arastoo", 10);
        
        if(B1.compareBook(B2))
            System.out.println("These two books are of same auther");
        else
            System.out.println("These two books are not of same auther");
        
        System.out.println(B1.compareChapterNames(B2));   
    }
    
}
