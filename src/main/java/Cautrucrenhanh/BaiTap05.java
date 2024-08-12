/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cautrucrenhanh;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BaiTap05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double km;
        double tientra;
        Scanner sc = new Scanner (System.in);
        System.out.println("====TINH TIEN TAXI====");
        //b1. nhap so km
        System.out.print("Cho biet so km:");
        km=sc.nextDouble();
        //b2.1.Tinh tien
        if (km<=1)
        {
            tientra = 15000;
        }else if (km<=5)
        {
            tientra = 15000 + (km-1)*13500; 
        }else //tren 6km 
        {
             tientra = 15000 +4*13500 + (km-5)*11000;
        }
        //b2.2 xet giam gia
        if (km>120)
        {
            tientra = tientra*0.1;
        }
        //b3. xuat ket qua 
        System.out.println("Tien tra:" + tientra);
        
    }
    
}
