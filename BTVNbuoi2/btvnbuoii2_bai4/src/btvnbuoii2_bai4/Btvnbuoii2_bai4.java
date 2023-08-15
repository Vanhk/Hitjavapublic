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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: "); 
        double a = scanner.nextDouble();
        System.out.print("Nhập b: "); 
        double b = scanner.nextDouble();
        System.out.print("Nhập c: "); 
        double c = scanner.nextDouble();
        
        double p = c/a;
        double s = -b/a;
        double delta = b*b - 4*a*c;
        
        if (p > 0 && s < 0 || delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        }
        else if (p == 0 && s <= 0) {
            System.out.println("Phương trình có nghiệm duy nhất");
            System.out.println("x1 =  " + 0);
        }
        else if (p < 0) {
            double t = (-b + Math.sqrt(delta))/2/a;
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.println("x1 =  " + Math.sqrt(t));
            System.out.println("x2 = -" + Math.sqrt(t));
        }
        else if (p > 0 && delta == 0) {
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.println("x1 =  " + Math.sqrt(s/2));
            System.out.println("x2 = -" + Math.sqrt(s/2));
        }
        else if (p == 0 && s > 0) {
            System.out.println("Phương trình có 3 nghiệm là: ");
            System.out.println("x1 =  " + 0);
            System.out.println("x2 =  " + Math.sqrt(s));
            System.out.println("x3 = -" + Math.sqrt(s));
        }
        else {
            double t1 = (-b + Math.sqrt(delta))/2/a;
            double t2 = (-b - Math.sqrt(delta))/2/a;
            System.out.println("Phương trình có 4 nghiệm là: ");
            System.out.println("x1 =  " + Math.sqrt(t1));
            System.out.println("x2 = -" + Math.sqrt(t1));
            System.out.println("x3 =  " + Math.sqrt(t2));
            System.out.println("x4 = -" + Math.sqrt(t2));
        }
        // TODO code application logic here
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap so a: ");
//        double a = scanner.nextDouble();
//        System.out.println("nhap so b: ");
//        double b = scanner.nextDouble();
//        System.out.println("nhap so c: ");
//        double c = scanner.nextDouble();
//        if (a==0){
//            System.out.println("phuong trinh khong phai bac 4");
//        }
//        
//        double delta = b * b -4 * a * c;
//        if(delta < 0){
//            System.out.println("phuong trinh vo nghiem");
//           
//        }else if(delta==0){
//            double x = -b/(2*a);
//            System.out.println("phuong trinh co nghiem kep x = " + x);
//        }else {
//            double sqrtDelta = Math.sqrt(delta);
//            double x1 = (-b + sqrtDelta) / (2*a);
//            double x2 = (-b - sqrtDelta) / (2*a);
//            System.out.println("phuong trinh co 4 nghiem: ");
//            System.out.println("x1 = " + Math.sqrt(x1));
//            System.out.println("x2 = " + -Math.sqrt(x1));
//            System.out.println("x3 = " + Math.sqrt(x2));
//            System.out.println("x4 = " + -Math.sqrt(x2));
//        }
        
        
    }
    
}
