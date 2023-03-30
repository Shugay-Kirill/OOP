package Homework_1;

public class son extends father{

    public son(int age, double weight, double height, String eyeColor, String humanTrait) {
        super(age, weight, height, eyeColor, humanTrait);
    }

    public son(int age, double weight, double height){
        super(age, weight, height);
    }



    @Override
    public void printСharacteristics() {
        System.out.printf("\nSon - Age: %d; Weigth: %.2f; Heigth: %.2f; Eye color: %s; Human trait: %s",
                age, weight, height,eyeColor, humanTrait);
    }

    public void responseSon(){
        System.out.println("I'm listening to");
    }

    
}
