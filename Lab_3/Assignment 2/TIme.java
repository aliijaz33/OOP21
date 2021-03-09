/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author cui
 */
public class TIme {
    public int hour;
    public int min;
    public int sec;
    
    public TIme(){
        hour = 0;
        min = 0;
        sec = 0;
    }
    public TIme(int a , int b , int c){
        hour = 12;
        min = 12;
        sec = 12;
    }
    public int display1()
    {
        return(hour);
    }  
    public int display2()
    {
        return(min);
    }    
    public int display3()
    {
        return(sec);
    }  
}
