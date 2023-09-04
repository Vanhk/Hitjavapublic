/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnbuoi6_bai1.newpackage;
import java.util.Scanner;
/**
 *
 * @author VANH
 */
public class Dog extends Animal {
        private String character;
	
	public Dog() {
		
	}

	public Dog(String character, String name, Byte age, Float weight) {
		super(name, age, weight);
		this.character = character;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so thich cua cho: ");
		String chatacter = sc.nextLine();
		this.character = chatacter;
	}
	
	public void output() {
		super.output();
		System.out.println("So thich cua cho: " + this.character);
	}
	
	@Override
	public void tiengKeu() {
		System.out.println("Tieng keu: gau gau");
	}

    
}
