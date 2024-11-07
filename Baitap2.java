/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Baitap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bai tap ");
        System.out.println("1. Tim phan tu lon nhat va nho nhat cua mang");
        System.out.println("2. Tinh tong va trung binh cua mang");
        System.out.println("3. Dem va in ra so lan xuat hien trong mang ");
        System.out.println("4. Sap xep mang theo thu tu tang dan");
        System.out.println("0. Thoat");
        System.out.print("Nhap lua chon: ");
        int choice = sc.nextInt();
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = sc.nextInt();
        }

        switch (choice) {
            case 1:
                int max = a[0], min = a[0];
                for (int i = 1; i < n; i++) {
                    if (a[i] > max)
                        max = a[i];
                    if (a[i] < min)
                        min = a[i];
                }
                System.out.println("Phan tu lon nhat: " + max);
                System.out.println("Phan tu nho nhat: " + min);
                break;

            case 2:
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += a[i];
                }
                double avg = (double) sum / n;
                System.out.println("Tong cua mang la: " + sum + "\nTrung binh cua mang la : " + avg);
                break;

            case 3:
                System.out.print("Nhap so can dem: ");
                int x = sc.nextInt();
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == x)
                        count++;
                }
                System.out.println("So lan xuat hien: " + count);
                break;

            case 4:
                for (int i = n - 1; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (a[j] > a[j + 1]) {
                            int tam = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = tam;
                        }
                    }
                }
                System.out.println("Mang sau khi sap xep: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }

    }
}
