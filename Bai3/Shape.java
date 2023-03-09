/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class Shape {
    public String color="red" ;
    public boolean filled =true;
    
    public Shape(){
        this.color=null;
        this.filled=true;
    }
    public Shape (String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    //get 
    public String getcolor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    //set
    public void setcolor(String vcolor){
        this.color=vcolor;
    }
    public void setFilled(boolean vFilled){
        this.filled=vFilled;
    }
    public String tosStringShape(){
        return "\nmau sac la: "+ this.color+"\n"+"false hay true :"+this.filled;
    }
}
