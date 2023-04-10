package Homework_2;

import java.util.Random;

public class chicken extends pet implements patPet{

    public chicken(String name, int age, double weight, double height) {
        super(name, age, weight, height);
    }
    /**
     * метод носки яиц курицы
     * @carryEggs
     */
    public int carryEggs() {
        Random random = new Random();
        int chanceEggs = random.nextInt(0, 2);
        int countEggs = 0;
        if (chanceEggs == 1) {
            countEggs = random.nextInt(1, 15);
            return countEggs;
        } else
            return countEggs;
    }

}
