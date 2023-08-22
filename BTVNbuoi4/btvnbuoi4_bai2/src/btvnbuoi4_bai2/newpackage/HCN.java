/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnbuoi4_bai2.newpackage;
import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class HCN {
    private float D;
    private float R;

    public void setD(float D) {
        this.D = D;
    }

    public float getD() {
        return D;
    }

    public void setR(float R) {
        this.R = R;
    }

    public float getR() {
        return R;
    }

    public void Nhap() {
        System.out.print("Nhap dai: ");
        this.D = input.nextFloat();
        System.out.print("Nhap rong: ");
        this.R = input.nextFloat();
    }

    public void veHCN() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < D; j++) {
                if (i == 0 || j == 0 || i == R - 1 || j == D - 1) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }

    public float chuVi() {
        return (D + R) * 2;
    }

    public float dienTich() {
        return D * R;
    }

    public HCN() {
    }

    public HCN(float D, float R) {
        this.D = D;
        this.R = R;
    }

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HCN hcn = new HCN();
        hcn.Nhap();
        hcn.veHCN();
        System.out.println("Chu vi HCN: " + hcn.chuVi());
        System.out.println("Dien tich HCN: " + hcn.dienTich());
    }
    
}
