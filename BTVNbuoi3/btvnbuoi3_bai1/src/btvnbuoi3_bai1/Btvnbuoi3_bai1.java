/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvnbuoi3_bai1;
import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class Btvnbuoi3_bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        System.out.print("Nhap so phan tu mang n : ");
        int n = s.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"] = ");
            a[i]=s.nextInt();
        }
        int dem = 0;
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
            if(a[i]==a[j])
            dem++;
           }
           System.out.println(a[i] + " xuat hien "+dem+" lan");
           dem=0;
        }
    }
    
}
