/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class Circle extends Shape{
    public double radius = 1.0;
    public double pi=3.14;
    
    public Circle(){
        this.radius=0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle (double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }
    //get
    public double getradius(){
        return this.radius;
    }
    //set
    public void setradius(double vradius){
        this.radius=vradius;
    }
    //getArea
    public double getArea(){
        return pi*this.radius*this.radius;
    }
    //getPerimetre
    public double getPerimeter(){
        return 2*this.radius*pi;
    }
     public String toStringCirle(){
         return "ban kinh la:"+this.radius+"\n"+"dien tich la: "+this.getArea()+"\n"+"chu vi la: "+this.getPerimeter();
     }
    
}




