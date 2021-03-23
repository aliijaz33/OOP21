
public class Book_Class {
    
    private String auther;
    private String[] chapterName;
    
    public Book_Class()
    {
    }
    public Book_Class(String auther, int Chapters)
    {
        this.auther = auther;
        chapterName = new String[Chapters];
    }
    public void setter(String auther, int Chapters)
    {
        this.auther = auther;
        chapterName = new String[Chapters];
    }
    public boolean compareBook(Book_Class b)
    {
        if (auther == b.auther)
            return true;
        else
            return false;
    }
    public String compareChapterNames(Book_Class b)
    {
        if (chapterName.length > b.chapterName.length)
            return "The book written by "+auther+" has more chapters";
        else
            return "The book written by "+b.auther+" has more chapters";
    }
    
    
    
}
