/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class Vehicle {
    public String color;
    public String model;
    public String phuongthucrun;
    
    public Vehicle(){
        this.color = null;
        this.model = null;
        this.phuongthucrun = null;
        
    }
    public Vehicle(String color, String model, String phuongthucrun){
        this.color = color;
        this.model = model;
        this.phuongthucrun =phuongthucrun;
        
    }
    //get 
    public String getcolor(){
        return this.color ;
    }
    public String getmodel(){
    return this.model ;
    }
    public String getphuongthucrun(){
    return this.phuongthucrun; 
    
    }
    //set
    public void setcolor(String vcolor){
        this.color =vcolor;
    }
    public void setmodel(String vmodel){
        this.model =vmodel;
        
    }
    public void setphuongthucrun(String vphuongthucrun){
        this.phuongthucrun =vphuongthucrun;
    }
    @Override
    public String toString(){
        return "color la: "+this.color+"\n"+
                "model la: "+this.model+"\n"+
                "phuong thuc la: "+this.phuongthucrun+"\n";
    }
    
}
