/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbuoi4.newpackage;

/**
 *
 * @author VANH
 */
public class Person {
    private String name;
    private int age;
    private String adress;
    private String honnhan;
    private int id;
    
    public  Person (String ten){
        name = ten;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String adress, String honnhan) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.honnhan = honnhan;
    }

    public String getAdress() {
        return adress;
    }

    public int getAge() {
        return age;
    }

    public String getHonnhan() {
        return honnhan;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        if(id > 100) return;
        
        this.id = id;
    }

    public void setAge(int age) {
        if(age >200) return;
        this.age = age;
    }
    
    
    public Person(){
        
    }
    
    
    
    public void coTheDi(){
        System.out.println("Person co the di");
    }
    
    public void coTheHoc(){
        System.out.println("person co the hoc");
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("Nguyen Viet Anh");
        p1.coTheDi();
        p1.coTheHoc();
        
        p1.setId(16);
        System.out.println(p1.getId());
        p1.setAge(11);
        System.out.println(p1.getAge());
        p1.adress = "Thanh Hoa";
        p1.honnhan = "Chua co ny";
         
        
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getAdress());
        System.out.println(p1.getHonnhan());
    }
   
            
    
}
