/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class TraiCayQua {
    public double giaban;
    public String nguongocxuatxu;
    public String ngaynhap;
    public int soluong;
    public double cannang;
    
    public TraiCayQua(){
        this.cannang        =0;
        this.giaban         =0;
        this.ngaynhap       =null;
        this.nguongocxuatxu =null;
        this.soluong        = 0;
}
    public TraiCayQua(double giaban, String nguongocxuatxu, String ngaynhap,int soluong,double cannang){
        
        this.cannang = cannang;
        this.giaban=   giaban;
        this.ngaynhap = ngaynhap;
        this.nguongocxuatxu = nguongocxuatxu;
        this.soluong = soluong;
    }
    // get
    public double getgiaban(){
        return this.giaban;
    }
    public String getnguongocxuatxu(){
        return this.nguongocxuatxu;
    }
    public String getngaynhap(){
        return this.ngaynhap;
    }
    public int getsoluong(){
        return this.soluong;
    }
    public double getcannang(){
        return this.cannang;
    }
    //set
    public void setgiaban(double vgiaban){
        this.giaban= vgiaban;
    }
    public void setnguongocxuatxu(String vnguongocxuatxu){
        this.nguongocxuatxu= vnguongocxuatxu;
    }
    public void setngaynhap(String vngaynhap){
        this.ngaynhap=vngaynhap;
    }
    public void setsoluong(int vsoluong){
        this.soluong= vsoluong;
}
    public void setcannang(double vcannang){
        this.cannang = vcannang;
    }
    @Override
    public String toString(){
        return "\n"+"gia ban la: "+ this.giaban+"\n"+
                "nguon goc xuat xu la: "+this.nguongocxuatxu+"\n"+
                "ngay nhap la:"+this.ngaynhap+"\n"+
                "so luong la: "+this.soluong+"\n"+
                "can nang la: "+ this.cannang+"\n";
                 
    }
}