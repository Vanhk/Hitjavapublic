/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvnbuoi3_bai3;
import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class Btvnbuoi3_bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner s= new Scanner(System.in);
    System.out.print("Nhap so luong phan tu : ");
    int n= s.nextInt();
    int [] a=new int[n];
    for(int i=0;i<n;i++)
    {
        System.out.print("a["+i+"] = ");
        a[i]=s.nextInt();
    }
    System.out.print("mang vua nhap la : ");
    for(int i=0;i<n;i++)
    {
        System.out.print(a[i]+" ");
    }
    System.out.print("\nmang sau khi sap xep la : ");
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                int b =a[i];
                a[i] = a[j];
                a[j]= b;
            }
        }
    }
     for(int i=0;i<n;i++)
    {
        System.out.print(a[i]+" ");
    }
    }
    
}
