/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codelearn;
import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class Codelearn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Nhập mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập vị trí cần thêm/xóa phần tử: ");
        int position = scanner.nextInt();

        if (position < 0 || position > n) {
            System.out.println("Vị trí không hợp lệ!");
        } else {
            System.out.println("Chọn thao tác (1 - Thêm, 2 - Xóa): ");
            int operation = scanner.nextInt();

            if (operation == 1) {
                System.out.print("Nhập giá trị phần tử mới: ");
                int newValue = scanner.nextInt();
                addElement(arr, position, newValue);
                System.out.print("Kết quả: ");
                printArray(arr);
            } else if (operation == 2) {
                removeElement(arr, position);
                System.out.print("Kết quả: ");
                printArray(arr);
            } else {
                System.out.println("Thao tác không hợp lệ!");
            }
        }
        
        scanner.close();
    }

    public static void addElement(int[] arr, int position, int newValue) {
        int n = arr.length;
        int[] newArr = new int[n + 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = newValue;

        for (int i = position + 1; i < n + 1; i++) {
            newArr[i] = arr[i - 1];
        }

        for (int i = 0; i < n + 1; i++) {
            arr[i] = newArr[i];
        }
    }

    public static void removeElement(int[] arr, int position) {
        int n = arr.length;

        for (int i = position; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void printArray(int[] arr) {
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
