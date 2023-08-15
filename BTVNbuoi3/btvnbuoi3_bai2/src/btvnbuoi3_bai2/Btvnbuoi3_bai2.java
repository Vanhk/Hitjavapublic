/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvnbuoi3_bai2;

import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class Btvnbuoi3_bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner s= new Scanner(System.in);
        System.out.print("Nhap so phan tu mang n : ");
        int n = s.nextInt();
        int [] a = new int[n];
        int [] b = new int[n+1];
        int [] c = new int[n-1];
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"] = ");
            a[i]=s.nextInt();
        }
        System.out.print("Nhap vi tri : ");
        int vt = s.nextInt();
        if(vt<=0 || vt>n)
        {
            System.out.print("Vi tri nhap khong hop le !");
        }
        else{
        System.out.print("Nhap 1 de them , nhap 2 de xoa ! : ");
        int x=s.nextInt();
        if(x==1)
        {
            System.out.print("Nhap gia tri phan tu moi : ");
            int gt = s.nextInt();
            for(int i=0;i<=n;i++)
            {
               if(i<(vt-1))
               {
                b[i]=a[i];
               } 
               if(i==(vt-1))
               {
                b[i]=gt;
               }
               if(i>(vt-1))
               {
                b[i]=a[i-1];
               }
            }
            System.out.println("Ket qua : ");
            for(int xuat : b)
            {
            System.out.print(xuat + " ");
            }
        }
        if(x==2)
        {
            for(int i=0;i<(n-1);i++)
            {
                if(i<(vt-1))
                {
                    c[i]=a[i];
                }
                if(i>=(vt-1))
                {
                    c[i]=a[i+1];
                }
            }
            System.out.print("Ket qua : ");
            for(int xuat : c)
            {
            System.out.print(xuat + " ");
            }
        }
        else{
            System.out.print("Sai cu phap ! ");
        }
    }
    }
    
}
