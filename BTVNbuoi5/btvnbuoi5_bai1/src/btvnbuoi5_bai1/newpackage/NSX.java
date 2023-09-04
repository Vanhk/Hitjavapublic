/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnbuoi5_bai1.newpackage;
import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class NSX {
       private String maNSX;
    private String tenNSX;
    private String dcNSX;

    public NSX(){
        maNSX = "";
        tenNSX = "";
        dcNSX = "";
    }

    public NSX(String maNSX, String tenNSX, String dcNSX){
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.dcNSX = dcNSX;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getDcNSX() {
        return dcNSX;
    }

    public void setDcNSX(String dcNSX) {
        this.dcNSX = dcNSX;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma NSX: ");
        this.maNSX = sc.nextLine();
        System.out.print("Nhap ten NSX: ");
        this.tenNSX = sc.nextLine();
        System.out.print("Nhap dia chi NSX: ");
        this.dcNSX = sc.nextLine();
    }

    public void Xuat(){
        System.out.printf("%-20s%-25s%-30s\n", this.maNSX, this.tenNSX, this.dcNSX);
    }
    
}
