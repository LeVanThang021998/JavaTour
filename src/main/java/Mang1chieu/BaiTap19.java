/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mang1chieu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaiTap19 {

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

        // Phát sinh giá trị ngẫu nhiên cho các phần tử của mảng
        phatSinhMang(a);

        // Xuất mảng ra màn hình trước khi sắp xếp
        System.out.println("=== Mang phat sinh ngau nhien ===");
        xuatMang(a);

        // Sắp xếp mảng tăng dần
        Arrays.sort(a);

        // Xuất mảng sau khi sắp xếp
        System.out.println("=== Mang sau khi sap xep tang dan ===");
        xuatMang(a);

        // Nhập số nguyên x từ bàn phím
        System.out.print("Nhap so nguyen x: ");
        int x = sc.nextInt();

        // Liệt kê các phần tử là ước số của x
        System.out.println("=== Cac phan tu la uoc so cua " + x + " ===");
        lietKeUocSo(a, x);
    }

    // Phương thức phát sinh giá trị ngẫu nhiên cho mảng
    public static void phatSinhMang(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100) + 1; // Giá trị ngẫu nhiên từ 1 đến 100
        }
    }

    // Phương thức xuất mảng ra màn hình
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Phương thức liệt kê các phần tử là ước số của x
    public static void lietKeUocSo(int[] a, int x) {
        boolean found = false;
        for (int value : a) {
            if (x % value == 0) {
                System.out.print(value + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co phan tu nao la uoc so cua " + x);
        } else {
            System.out.println();
        }
    }
}
