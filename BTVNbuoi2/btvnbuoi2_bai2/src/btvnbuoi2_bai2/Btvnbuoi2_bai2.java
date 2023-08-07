/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvnbuoi2_bai2;
import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class Btvnbuoi2_bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen duongw n :");
        int n = scanner.nextInt();
        
        
        float s = 0;
        
        for(int i=1;i<=n;i++){
            s +=(float)1/i;
        }
        System.out.println("gia tri cua bieu thuc s la : " + s);
        float p = 0;
        float gt = 1;
        for(int i=1;i<=n;i++){
            gt *= i;
            p += gt;
        }
        System.out.println("gia tri cua bieu thuc p la : " + p);
    }
    
}
