/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mang1chieu;
import java.util.Scanner;

public class BaiTap17 {

    public static void main(String[] args) {
        // Khai báo mảng số thực
        float[] a;
        int n; // Số lượng phần tử của mảng
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        do {
            System.out.print("Nhap so phan tu mang (1 <= n <= 20): ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);

        // Khởi tạo mảng với kích thước n
        a = new float[n];

        // Nhập giá trị cho các phần tử của mảng
        nhapMang(a, sc);

        // Xuất mảng ra màn hình
        System.out.println("=== Mang da nhap ===");
        xuatMang(a);

        // Tính trung bình giá trị của mảng
        float average = tinhTrungBinh(a);
        System.out.printf("Trung binh gia tri cua mang: %.2f\n", average);

        // Tìm phần tử nhỏ nhất trong mảng
        float minValue = timMin(a);
        System.out.printf("Phan tu nho nhat trong mang: %.2f\n", minValue);
    }

    // Định nghĩa phương thức nhập mảng
    public static void nhapMang(float[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap gia tri cho a[" + i + "]: ");
            a[i] = sc.nextFloat();
        }
    }

    // Định nghĩa phương thức xuất mảng
    public static void xuatMang(float[] a) {
        for (float x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Định nghĩa phương thức tính trung bình giá trị
    public static float tinhTrungBinh(float[] a) {
        float sum = 0;
        for (float x : a) {
            sum += x;
        }
        return sum / a.length;
    }

    // Định nghĩa phương thức tìm phần tử nhỏ nhất
    public static float timMin(float[] a) {
        float min = a[0];
        for (float x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}
