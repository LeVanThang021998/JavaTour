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
public class BaiTap07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int thang, nam;
        int kq;
        Scanner sc = new Scanner(System.in);
        System.out.println("==== CHUONG TRINH TINH SO NGAY CUA THANG TRONG NAM ====");
        //b1. doc gia tri thang, nam
        System.out.print("Cho biet thang:");
        thang = sc.nextInt();
        System.out.print("Cho biet nam:");
        nam = sc.nextInt();
        //b2. xet so ngay cua thang trong nam
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                kq = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                kq = 30;
                break;
            case 2:
                //xet nam
                if (nam / 4 == 0) {
                    kq = 29;
                } else {
                    kq = 28;
                }
                break;
            default:
                throw new AssertionError();
        }
        //b3. xuat ket qua
        System.out.println(" Thang " + thang + " Nam " + nam + " co " + kq + " Ngay ");
    }
}
