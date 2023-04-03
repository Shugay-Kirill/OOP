package Homework_2;

public class father extends familyMember {
    
    public father(String name, String family, String gender, int age, double weight, double height) {
        super(name, family, gender, age, weight, height);
    }

    public String working;

    public void getWorking(String working){
        System.out.printf("\nworking - %s", working );
    }
    

}

