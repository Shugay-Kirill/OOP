package Homework_2;

public class Programm {
    public static void main(String[] args) {
        father father = new father("Dima", "Ivanov", "M", 35, 70, 180);
        father.printСharacteristics();
        father.getWorking("engineer");
        cat cat = new cat("bars", 2, 5, 20);
        father.pat(cat);
        chicken chichen = new chicken("Ko-ko", 1, 2, 30);
        father.pat(chichen);
        father.checkEggs(chichen);
    }
}
