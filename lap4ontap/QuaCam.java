/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4ontap;

/**
 *
 * @author Admin
 */
public class QuaCam extends TraiCayQua{
    public String tenQuaCam;
    public QuaCam (double giaban, String nguongocxuatxu,String ngaynhap, int soluong,double cannang, String tenQuaCam){
        super (giaban,nguongocxuatxu, ngaynhap, soluong, cannang);
        this.tenQuaCam=tenQuaCam;
    }
    //get
    public String gettenQuaCam(){
        return this.tenQuaCam;
    }
    //set
    public void settenQuaCam(String vtenQuaCam){
        this.tenQuaCam=vtenQuaCam;
    }
    public String toStringQuaCam(){
        return "ten qua cam la: "+ this.tenQuaCam+"\n";
    }
}

