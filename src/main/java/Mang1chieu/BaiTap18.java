/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mang1chieu;

import java.util.Scanner;

public class BaiTap18 {

    public static void main(String[] args) {
        // Khai báo mảng số nguyên
        int[] a;
        int n; // Số lượng phần tử của mảng
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        do {
            System.out.print("Nhap so phan tu mang (1 <= n <= 50): ");
            n = sc.nextInt();
        } while (n < 1 || n > 50);

        // Khởi tạo mảng với kích thước n
        a = new int[n];

        // Nhập giá trị cho các phần tử của mảng
        nhapMang(a, sc);

        // Xuất mảng ra màn hình
        System.out.println("=== Mang da nhap ===");
        xuatMang(a);

        // Liệt kê các phần tử không phải là số nguyên tố
        System.out.println("=== Cac phan tu khong phai so nguyen to ===");
        lietKeKhongPhaiSoNguyenTo(a);

        // Tính giá trị trung bình của các phần tử là số nguyên tố
        double avg = tinhTrungBinhSoNguyenTo(a);
        if (avg != -1) {
            System.out.printf("Gia tri trung binh cua cac so nguyen to: %.2f\n", avg);
        } else {
            System.out.println("Khong co so nguyen to trong mang de tinh trung binh.");
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

    // Phương thức kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Phương thức liệt kê các phần tử không phải là số nguyên tố
    public static void lietKeKhongPhaiSoNguyenTo(int[] a) {
        boolean found = false;
        for (int x : a) {
            if (!laSoNguyenTo(x)) {
                System.out.print(x + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tat ca cac phan tu trong mang deu la so nguyen to.");
        } else {
            System.out.println();
        }
    }

    // Phương thức tính giá trị trung bình của các phần tử là số nguyên tố
    public static double tinhTrungBinhSoNguyenTo(int[] a) {
        int sum = 0, count = 0;
        for (int x : a) {
            if (laSoNguyenTo(x)) {
                sum += x;
                count++;
            }
        }
        return count > 0 ? (double) sum / count : -1; // Trả về -1 nếu không có số nguyên tố nào
    }
}
