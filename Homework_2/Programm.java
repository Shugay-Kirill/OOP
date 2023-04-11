package Homework_2;

public class Programm {
    public static void main(String[] args) {
        father father = new father("Dima", "Ivanov", "M", 35, 70, 180);
        father father2 = new father("Andrey", "Ivanov", "M", 35, 70, 180);
        father.printСharacteristics();
        father.getWorking("engineer");
        cat cat = new cat("bars", 2, 5, 20);
        father.pat(cat);
        var chichen = new chicken("Ko-ko", 1, 2, 30);
        father.pat(chichen);
        father.checkEggs(chichen);
        var chicken2 = new chicken("Ku-Ku", 0, 0, 0);
        listFamily lf = new listFamily<>();
        lf.creationList();
        lf.addList(father);
        lf.addList(father2);
        lf.getFamily();
        listPet lp = new listPet();
        lp.creationList();
        lp.addList(cat);
        lp.addList(chichen);
        lp.addList(chicken2);
        lp.getPet();

    }
}
