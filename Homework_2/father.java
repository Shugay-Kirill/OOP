package Homework_2;
// import Homework_2.chicken;
// import Homework_2.pet;

public class father extends familyMember{
    
    public father(String name, String family, String gender, int age, double weight, double height) {
        super(name, family, gender, age, weight, height);
    }

    private String working;
    /**
     * запись и вывод работы
     * @param working
     */
    public void getWorking(String working){
        System.out.printf("\nworking - %s", this.working );
    }
    public void setWorking(String working){
        this.working = working;
    }
    /**
     * проверка количества яиц у курицы
     * @param animal
     */
    public void checkEggs(chicken animal) {
        System.out.printf("Количиство яиц у этой курицы %s = %d\n",animal.name, animal.carryEggs());
    }

}

