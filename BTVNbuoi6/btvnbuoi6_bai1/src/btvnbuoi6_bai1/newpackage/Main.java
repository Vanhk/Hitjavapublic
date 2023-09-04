/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnbuoi6_bai1.newpackage;
import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cat cat = new Cat();
		Dog dog = new Dog();
		System.out.println("Nhap thong tin cua meo: ");
		cat.input();
		System.out.println("Thong tin cua meo: ");
		cat.output();
		cat.tiengKeu();
		System.out.println("Nhap thong tin cua cho: ");
		dog.input();
		System.out.println("Thong tin cua cho: ");
		dog.output();
		dog.tiengKeu();
	}
    
}
