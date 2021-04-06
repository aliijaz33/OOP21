
public class ObjectCreation {
    private static int ObjectCreated;
    private static int ObjectDestroyed;
    private int number;
    
    public ObjectCreation(){
        
        number = 20;
        ObjectCreated++;
    }
    
    public ObjectCreation(int n){
        
        number = n;
        ObjectCreated++;
    }
    
    public static void destroyedObject(){
        
        ObjectDestroyed++;
        
    }
    
    public static void print(){
        System.out.println("Objects which Are Created:" +ObjectCreated);
        System.out.println("Objects which Are Destroyed:" +ObjectDestroyed);
    }
}
