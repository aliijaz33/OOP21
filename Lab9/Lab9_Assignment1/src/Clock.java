
public class Clock {
    private int hour;
    private int mins;
    private int sec;
    
    public Clock(int hour, int mins, int sec){
        this.hour = hour%24;
        this.mins = mins%60;
        this.sec = sec%60;
    }
    
    public int getHour(){
        return hour;
    }
    
    public int getMins(){
        return mins;
    }
    
    public int getSec(){
        return sec;
    }
    
    public void display(){
        System.out.println(hour+"/"+mins+"/"+sec);
    }
}
