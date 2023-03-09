/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4ontap;

/**
 *
 * @author Admin
 */
public class QuaTao extends TraiCayQua{
    public String tenQuaTao;
    public QuaTao(double giaban, String nguongocxuatxu,String ngaynhap, int soluong,double cannang, String tenQuaTao){
        super (giaban,nguongocxuatxu, ngaynhap, soluong, cannang);
        this.tenQuaTao=tenQuaTao;
    }
    //get
    public String gettenQuaTao(){
        return this.tenQuaTao;
    }
    //set
    public void settenQuaTao(String vtenQuaTao){
        this.tenQuaTao=vtenQuaTao;
    }
    public String toStringQuaTao(){
        return "ten qua tao la: "+ this.tenQuaTao;
    }
}

