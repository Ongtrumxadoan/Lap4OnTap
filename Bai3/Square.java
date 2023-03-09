/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class Square extends RecTangle{
     
     public Square(){
         
     }
    public Square(double side){
         super (side,side);
    }
    public Square(double side, String color, boolean filled){
       super(side, side,color,filled);
         
       
    }
    //get
    public double getside(){
        return this.length;
    }
    //set
    public void setside(double side){
         setwidth(side);
        setlength(side);
    }
    //setWidth
    public void setWidth(double side){
       setside(width);
        
    }
    public void setLength(double side){
        setside(length);
    }
    public String toStringSquare(){
        return   "A Square with side="
                + getside()
                + ", which is a subclass of "
                + super.toStringRecTangle();
    }
    
}
