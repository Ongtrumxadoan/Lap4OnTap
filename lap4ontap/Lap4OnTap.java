/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lap4ontap;

/**
 *
 * @author Admin
 */
public class Lap4OnTap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HoaQua hq = new HoaQua(7000, "Dai Loan", "12", 1000, 12.5, "Hoa Nhai");
        System.out.println(hq.toStringHoaQua()+hq.toString());
        System.out.println("---------------------------------");
        
        QuaCam qc =new QuaCam(3000, "Trung Quoc", "2", 200, 20.6,"Cam Xanh");
        System.out.println(qc.toStringQuaCam()+qc.toString());
        System.out.println("---------------------------------");
        
        CamCaoPhong ccp = new CamCaoPhong(4000, "Thai Lan", "24", 2510, 40.6, "Cam Cao Phong S1", 40);
        System.out.println(ccp.toStringQuaCam()+ccp.toStringCamCaoPhong()+ccp.toString());
        System.out.println("---------------------------------");
        
        CamSanh cs = new CamSanh(35000, "India", "23", 1200, 15.9, "Canh Sanh S1", 18);
        System.out.println(cs.toStringQuaCam()+cs.toStringCamSanh()+cs.toString());
    }
}