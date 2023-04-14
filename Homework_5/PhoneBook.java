package Homework_5;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import Homework_5.View;

class PhoneBook{
    private int phone;
    private String name;
    private String comment;
    
    public PhoneBook(int phone, String name, String comment) {
        this.phone = phone;
        this.name = name;
        this.comment = comment;
    }
    
    public int getPhone(){
        return this.phone;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getComment(){
        return this.comment;
    }
}
/**список телефонной книги */
class ListPhoneBook<T extends PhoneBook>{
    List<T> lpb;
    public T item;

    public void creationList(){
        this.lpb = new ArrayList<>();    
    }

    public void addList(T item){
        lpb.add(item);
    }

    public void getList(){
        View v = new View();
        for (T item : lpb) {
            v.printPhoneBook(item);
        }
    }
}