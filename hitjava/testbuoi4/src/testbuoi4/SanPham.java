/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbuoi4;

/**
 *
 * @author VANH
 */
public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private float giaSanPham;
    private int soLuong;

    // Constructors
    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, float giaSanPham, int soLuong) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.soLuong = soLuong;
    }

    // Getters and Setters
    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public float getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(float giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
// 
//   import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Nhập số lượng sản phẩm
//        System.out.print("Nhập số lượng sản phẩm: ");
//        int n = scanner.nextInt();
//
//        // Tạo mảng đối tượng SanPham
//        SanPham[] danhSachSanPham = new SanPham[n];
//
//        // Nhập thông tin cho từng sản phẩm
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập thông tin sản phẩm " + (i + 1) + ":");
//            scanner.nextLine(); // Đọc bỏ dòng thừa sau khi nhập số lượng
//
//            System.out.print("Mã sản phẩm: ");
//            String maSanPham = scanner.nextLine();
//
//            System.out.print("Tên sản phẩm: ");
//            String tenSanPham = scanner.nextLine();
//
//            System.out.print("Giá sản phẩm: ");
//            float giaSanPham = scanner.nextFloat();
//
//            System.out.print("Số lượng: ");
//            int soLuong = scanner.nextInt();
//
//            SanPham sanPham = new SanPham(maSanPham, tenSanPham, giaSanPham, soLuong);
//            danhSachSanPham[i] = sanPham;
//        }
//
//        // Hiển thị sản phẩm có giá cao nhất
//        SanPham sanPhamCaoNhat = danhSachSanPham[0];
//        for (int i = 1; i < n; i++) {
//            if (danhSachSanPham[i].getGiaSanPham() > sanPhamCaoNhat.getGiaSanPham()) {
//                sanPhamCaoNhat = danhSachSanPham[i];
//            }
//        }
//        System.out.println("Sản phẩm có giá cao nhất là:");
//        System.out.println("Mã sản phẩm: " + sanPhamCaoNhat.getMaSanPham());
//        System.out.println("Tên sản phẩm: " + sanPhamCaoNhat.getTenSanPham());
//        System.out.println("Giá sản phẩm: " + sanPhamCaoNhat.getGiaSanPham());
//        System.out.println("Số lượng: " + sanPhamCaoNhat.getSoLuong());
//
//        // Tính tổng giá trị tất cả các sản phẩm
//        float tongGiaTri = 0;
//        for (int i = 0; i < n; i++) {
//            tongGiaTri += danhSachSanPham[i].getGiaSanPham() * danhSachSanPham[i].getSoLuong();
//        }
//        System.out.println("Tổng giá trị của tất cả các sản phẩm là: " + tongGiaTri);
//    }
//}