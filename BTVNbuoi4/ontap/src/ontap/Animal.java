/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author VANH
 */
public class Animal {
     protected String name;
    protected String color;

    public Animal() {
       
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void input() {
        
    }

    public void output() {
     
    }
}

class Cat extends Animal {
    private int age;

    public Cat() {
        
    }

    public Cat(String name, String color, int age) {
        super(name, color);
        this.age = age;
    }

    @Override
    public void input() {
        
        super.input();
       
    }

    @Override
    public void output() {
       
        super.output();
        
    }

    public int getAge() {
        return age;
    }
}



