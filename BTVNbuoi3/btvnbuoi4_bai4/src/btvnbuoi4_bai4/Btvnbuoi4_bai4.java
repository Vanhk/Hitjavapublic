/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvnbuoi4_bai4;
import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class Btvnbuoi4_bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        String a = s.nextLine();
        String b = new StringBuilder(a).reverse().toString();
        if(a.compareTo(b)==0)
        System.out.println("True");
        else
        System.out.println("False");
    }
    
}
