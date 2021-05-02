import java.util.*;
public class CustomStringTokenizer extends StringTokenizer{
    private String string;
    public CustomStringTokenizer(String string){
        super(string);
        this.string = string;
    }
    
//@Override
public int countToken(){
        String[] token = string.split(" ");
        String[] number = {"1", "2","3","4","5","6","7","8","9"};
        int tokenCount = 0;
        for (int i=0; i<token.length; i++){
            boolean numericVal = true;
            for (int j=0; j<number.length; j++){
                if (token[i].contains(number[j])){
                    numericVal = false;
                }
            }
            if (numericVal){
                    tokenCount++;
            }
        }
        return tokenCount;
    }
    
}

    