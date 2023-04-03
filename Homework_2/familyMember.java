package Homework_2;
import Homework_2.pet;
public class familyMember {
    protected String name;
    protected String family;
    protected String gender;
    protected int age;
    protected double weight;
    protected double height;
    
    public familyMember(String name, String family, String gender, int age, double weight, double height) {
        this.name = name;
        this.family = family;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printСharacteristics() {
        System.out.printf("\n%s %s; Son - Age: %d; Weigth: %.2f; Heigth: %.2f;",
                name, family, age, weight, height);
   }

    public void pat(pet pet){
        System.out.printf("\n- %s",pet.name);
        pet.voise();
   }
}
