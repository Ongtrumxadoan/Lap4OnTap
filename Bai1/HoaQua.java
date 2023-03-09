/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class HoaQua extends TraiCayQua{
    public String tenHoaQua;
    public HoaQua(double giaban, String nguongocxuatxu,String ngaynhap, int soluong,double cannang, String tenHoaQua){
        super (giaban,nguongocxuatxu, ngaynhap, soluong, cannang);
        this.tenHoaQua=tenHoaQua;
    }
    //get
    public String gettenHoaQua(){
        return this.tenHoaQua;
    }
    //set
    public void settenHoaQua(String vtenHoaQua){
        this.tenHoaQua=vtenHoaQua;
    }
    public String toStringHoaQua(){
        return "ten hoa qua la: "+ this.tenHoaQua;
    }
}
