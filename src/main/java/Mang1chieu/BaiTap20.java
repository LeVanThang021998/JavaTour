/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mang1chieu;
import java.util.Scanner;

public class BaiTap20 {

    public static void main(String[] args) {
        // Khai báo mảng số nguyên
        int[] a;
        int n; // Số lượng phần tử của mảng
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        do {
            System.out.print("Nhap so phan tu mang (1 <= n <= 20): ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);

        // Khởi tạo mảng với kích thước n
       a = new int[n];

        // Nhập giá trị cho các phần tử của mảng
        nhapMang(a, sc);

        // Xuất mảng ra màn hình
        System.out.println("=== Mang da nhap ===");
        xuatMang(a);

        // Nhập số nguyên x từ bàn phím
        System.out.print("Nhap so nguyen x: ");
        int x = sc.nextInt();

        // Kiểm tra x có xuất hiện trong mảng không và nếu có thì ở vị trí đầu tiên nào
        int viTri = timViTriDauTien(a, x);
        if (viTri != -1) {
            System.out.println("So nguyen " + x + " xuat hien dau tien o vi tri: " + viTri);
        } else {
            System.out.println("So nguyen " + x + " khong xuat hien trong mang.");
        }

        // Kiểm tra mảng có tính chất tăng dần hay không
        if (kiemTraTangDan(a)) {
            System.out.println("Mang co tinh chat tang dan.");
        } else {
            System.out.println("Mang khong co tinh chat tang dan.");
        }
    }

    // Phương thức nhập mảng
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap gia tri cho a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    // Phương thức xuất mảng ra màn hình
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Phương thức tìm vị trí đầu tiên của x trong mảng
    public static int timViTriDauTien(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i; // Trả về vị trí đầu tiên (index)
            }
        }
        return -1; // Nếu không tìm thấy x
    }

    // Phương thức kiểm tra mảng có tính chất tăng dần hay không
    public static boolean kiemTraTangDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false; // Nếu phần tử hiện tại lớn hơn phần tử kế tiếp, mảng không tăng dần
            }
        }
        return true; // Nếu tất cả các phần tử đều tăng dần
    }
}
