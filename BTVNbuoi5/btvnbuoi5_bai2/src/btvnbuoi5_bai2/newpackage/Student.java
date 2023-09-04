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
public class Student {
     private String name;
    private String class1;
    private double score;
    private Faculty y;

    public Student() {
        this.y = new Faculty();
    }

    public Student(String name, String class1, double score, Faculty y) {
        this.name = name;
        this.class1 = class1;
        this.score = score;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten SV: ");
        this.name = sc.nextLine();
        System.out.print("Nhap lop: ");
        this.class1 = sc.nextLine();
        System.out.print("Nhap diem so: ");
        this.score = sc.nextDouble();

        this.y.Input();
    }


    public void Output(){
        System.out.printf("%-20s%-10s%-10s", this.name, this.class1, this.score);
        this.y.Output();
    }

    
}
