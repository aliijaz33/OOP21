
public class Lab6_Act2_Runner {

    
    public static void main(String[] args) {
        ObjectCreation obj1 = new ObjectCreation(10);
        ObjectCreation obj2 = new ObjectCreation();
        ObjectCreation obj3 = new ObjectCreation(40);
        ObjectCreation obj4 = new ObjectCreation(50);
        ObjectCreation obj5 = new ObjectCreation(60);
        obj2 = null;
        ObjectCreation.destroyedObject();
        ObjectCreation.print();
    }
    
}
