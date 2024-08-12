/*
 */
package Cautrucrenhanh;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BaiTap02 {
    public static void main(String[] args) {
        double toan,van,anh;
        double dtb;
        String kq="";
        Scanner sc = new Scanner(System.in);
        System.out.println("===XEP LOAI HOC LUC");
        //b1. nhap diem toan,van,anh
        System.out.print("Nhap diem toan:");
        toan=sc.nextDouble();
        System.out.print("Nhap diem van:");
        van=sc.nextDouble();
        System.out.print("Nhap diem anh:");
        anh=sc.nextDouble();
        
        //b2. tinh diem trung binh
        dtb= (toan+van+anh)/3;
        //b3. xep loai dua tren dtb
        if (dtb<4){
            kq="Yeu";
        }else if(dtb<6.5){
            kq="Trung Binh";
        }else if(dtb<8){
            kq="Kha";
        }else
        {
            kq="Gioi";
        }
        //b4. xuat ket qua
        System.out.println("DTB:" + dtb + " - Xep loai:" + kq);
    }
    
}
