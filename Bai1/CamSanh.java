/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class CamSanh extends QuaCam{
    public double cosize;
    public CamSanh(double giaban, String nguongocxuatxu,String ngaynhap, int soluong,double cannang, String tenQuaCam,double cosize){
        super (giaban,nguongocxuatxu, ngaynhap, soluong, cannang,tenQuaCam);
        this.cosize=cosize;
    }
    //get
    public double getcosize(){
        return this.cosize;
    }
    //set
    public void setcosize(double vcosize){
        this.cosize=vcosize;
    }
     
    public String toStringCamSanh(){
        return "co size la: "+ this.cosize;
    }
}


