/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvnbuoi2_bai3;
import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class Btvnbuoi2_bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        int dem = 0;
        for(int i=1;i<=n;i++){
            if (n%i==0){
            dem++;
            }
        }
        System.out.println("ket qua: ");
        if(dem==2){
            System.out.println(n + " la so nguyen to");
        }else
            System.out.println(n + " khong la so nguyen to");
    }
    
}
