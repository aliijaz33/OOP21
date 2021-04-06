
public class Lab6_Assig_Runner {

    
    public static void main(String[] args) {
        String[] s = {"sum", "multiply", "divide", "modulus", "sin", "cos", "tan"};
        Calculator.showManu(s);
        int option = -1;
        while (option != 0)
        {
            option = Calculator.getOption();
            if(option >0 && option<=s.length)
                switch (option)
                {
                    case 1:
                        Calculator.sum();
                        break;
                    case 2:
                        Calculator.multiply();
                        break;
                    case 3:
                        Calculator.divide();
                        break;
                    case 4:
                        Calculator.modulus();
                        break;
                    case 5:
                        Calculator.sin();
                        break;
                    case 6:
                        Calculator.cos();
                        break;
                    case 7: 
                        Calculator.tan();
                        break;
                }
            else if(option<0 && option>s.length)
                System.out.println("your choosen option is incorrect: "); 
        }
    }
    
    
}
