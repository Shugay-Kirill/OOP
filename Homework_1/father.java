package Homework_1;

public class father {
    public int age;
    public double weight;
    public double height;
    protected static String eyeColor;
    protected static String humanTrait;

    public father(int age, double weight, double height, String eyeColor, String humanTrait) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.eyeColor = eyeColor;
        this.humanTrait = humanTrait;
    }

    public father(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printСharacteristics() {
        System.out.printf("\nFather - Age: %d; Weigth: %.2f; Heigth: %.2f; Eye color: %s; Human trait: %s",
                age, weight, height, eyeColor, humanTrait);
    }

    public void openCloset(){
    
    }

    private void collSon(son son){
        System.out.println("\nSon");
        son.responseSon();
    }

    public void openCloset(son son){
        collSon(son);
        System.out.println("Open closet");
    }

    
}
