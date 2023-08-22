/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbuoi4.newpackage1;

/**
 *
 * @author VANH
 */
public class HCN {
    private int chieuDai;
    private int chieuRong;
    public int chuvi(){
        return (this.chieuDai + this.chieuRong)* 2;
    }
    public int dientich(){
        return (this.chieuDai * this.chieuRong);
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public static void main(String[] args) {
        HCN hinhchunhat = new HCN();
    }
    
    
    
    
}
