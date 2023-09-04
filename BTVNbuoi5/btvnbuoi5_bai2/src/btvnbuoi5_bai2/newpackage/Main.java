/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnbuoi5_bai2.newpackage;
import java.util.Scanner;

/**
 *
 * @author VANH
 */
public class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so sinh vien:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i=0; i<n; i++){
            students[i] = new Student();
            students[i].Input();
        }

        System.out.printf("%-20s%-10s%-10s%-20s%-15s%-20s%-15s\n", "Ten SV", "Lop", "Diem so", "Ten khoa", "Ngay vao", "Ten truong", "Ngay vao");

        for(int i=0; i<n; i++){
            students[i].Output();
        }
    }
    
}
