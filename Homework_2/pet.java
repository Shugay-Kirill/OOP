package Homework_2;

public class pet implements patPet{
    protected String name;
    protected int age;
    protected double weight;
    protected double height;

    public pet(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void voise(){
        System.out.println("\n- !@#!@!@!@#$%!@");
    }
    
}
