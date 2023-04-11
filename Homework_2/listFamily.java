package Homework_2;

import java.util.ArrayList;
import java.util.List;

public class listFamily<T extends familyMember> {
    List<T> lf;
    public T item;
    
    public void creationList(){
        this.lf = new ArrayList<>();
    }
    
    public void addList(T item){
        lf.add(item);
    }

    public void getFamily(){
        for (T item : lf) {
            System.out.println("Type: " + item.getClass().getName() + "; Name: " + item.name);
        }
    }
}
class listPet<U extends pet>{
    List<U> lf;
    public U item;
    
    public void creationList(){
        this.lf = new ArrayList<>();
    }
    
    public void addList(U item){
        lf.add(item);
    }

    public void getPet(){
        for (U item : lf) {
            System.out.println("Type: " + item.getClass().getName() + "; Name: " + item.name);
        }
    }
}