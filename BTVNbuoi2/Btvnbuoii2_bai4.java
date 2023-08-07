/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvnbuoii2_bai4;
import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class Btvnbuoii2_bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a: ");
        double a = scanner.nextDouble();
        System.out.println("nhap so b: ");
        double b = scanner.nextDouble();
        System.out.println("nhap so c: ");
        double c = scanner.nextDouble();
        if (a==0){
            System.out.println("phuong trinh khong phai bac 4");
        }
        
        double delta = b * b -4 * a * c;
        if(delta < 0){
            System.out.println("phuong trinh vo nghiem");
           
        }else if(delta==0){
            double x = -b/(2*a);
            System.out.println("phuong trinh co nghiem kep x = " + x);
        }else {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2*a);
            double x2 = (-b - sqrtDelta) / (2*a);
            System.out.println("phuong trinh co 4 nghiem: ");
            System.out.println("x1 = " + Math.sqrt(x1));
            System.out.println("x2 = " + -Math.sqrt(x1));
            System.out.println("x3 = " + Math.sqrt(x2));
            System.out.println("x4 = " + -Math.sqrt(x2));
        }
        
        
    }
    
}
