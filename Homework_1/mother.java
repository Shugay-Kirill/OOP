package Homework_1;

public class mother {

    public int age;
    public double weight;
    public double height;
    private String eyeColor;
    public String humanTrait;

    public mother(int age, double weight, double height, String eyeColor, String humanTrait) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.eyeColor = eyeColor;
        this.humanTrait = humanTrait;
    }

    public void printСharacteristics() {
        System.out.printf("\nMother - Age: %d; Weigth: %.2f; Heigth: %.2f; Eye color: %s; Human trait: %s",
                age, weight, height, eyeColor, humanTrait);
    }

    public String getEyeColer(){
        return this.eyeColor;
    }
}
