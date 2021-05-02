
public class ClockExtended extends Clock{
    public ClockExtended(int hour, int mins, int sec){
        super(hour, mins, sec);
    }
    
    @Override
    
    public void display(){
        System.out.println("[[ Clock ]] \nAM/PM FORMATE");
        if(getHour() < 12 || getHour()==24){
            int hr = getHour()%12;
            if (hr==0){
                hr = 12;
            }
            System.out.println(hr+"/"+getMins()+"/"+getSec()+" AM");
        }
        else{
            int hr = getHour()%12;
            if(hr==0){
                hr = 12;
            }
            System.out.println(getHour()%12+"/"+getMins()+"/"+getSec()+" PM");
        }
        System.out.println("\nFORMATE FOR 24 HOUR");
        super.display();
    }
    
}
