/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class RecTangle extends Shape{
    public double width =1.0;
    public double length=1.0;
    
    public RecTangle(){
        this.length =0;
        this.width  =0;
    }
    public RecTangle(double width, double length){
        this.length = length;
        this.width  = width;
    }
    public RecTangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.length=length;
        this.width = width;
    }
    //get
    public double getwidth(){
        return this.width;
    }
    public double getlength(){
        return this.length;
    }
    //set
    public void setwidth(double vwidth){
        this.width=vwidth;
    }
    public void setlength(double vlength){
        this.length=vlength;
    }
    //getArea
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return (this.length+this.width)*2;
    }
  
    public String toStringRecTangle (){
    return "chieu dai la:"+this.length+"\n"+"chieu rong la:" + this.width+"\n"+ "dien tich hinh chu nhat la:"+this.getArea()+
           "\n"+ "chu vi hinh chu nhat la:"+this.getPerimeter();
    }
}
