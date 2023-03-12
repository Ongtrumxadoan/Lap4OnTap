/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String [] args){
        Car c = new Car("mau do", "4 banh", "tren mat dat");
        System.out.print(c.toString());
        System.out.println("-----------------------------------");
        Bycycle b = new Bycycle("mau den", "2 banh", "chay tren mat dat");
        System.out.println(b.toString());
            }
    }
    