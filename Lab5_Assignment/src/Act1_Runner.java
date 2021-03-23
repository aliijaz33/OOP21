
public class Act1_Runner {

    
    public static void main(String[] args) {

        Distance_Class D1 = new Distance_Class();
        Distance_Class D2 = new Distance_Class(4 , 2);
        Distance_Class D3 = D1.addDistances(D2);
        D1.setter(12 , 1);
        D3.display();
    }
    }