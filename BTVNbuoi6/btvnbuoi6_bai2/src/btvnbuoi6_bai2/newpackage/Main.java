/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnbuoi6_bai2.newpackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		sc.nextLine();
		List<Student> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Student student = new Student();
			System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ": ");
			student.input();
			list.add(student);
		}
		
		System.out.println("Thong tin sinh vien: ");
		for(Student s : list) {
			s.output();
		}
	}
    
}
