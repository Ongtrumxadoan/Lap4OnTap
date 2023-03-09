/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4ontap;

/**
 *
 * @author Admin
 */
public class CamCaoPhong extends QuaCam{
     public double cosize;
    public CamCaoPhong(double giaban, String nguongocxuatxu,String ngaynhap, int soluong,double cannang, String tenQuaCam,double cosize){
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
    public String toStringCamCaoPhong(){
        return "co size  la: "+ this.cosize;
    }
}

