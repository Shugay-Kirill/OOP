package Homework_6;
import Homework_6.View;

public class Controller {
    /**
     * Старт программы
     */
    public static void start(){
        View v = new View();
        ListPhoneBook pb = new ListPhoneBook();
        pb.creationList();
        while (true){
            int numberMenu = v.menu();
            switch (numberMenu) {
                case 1:
                    pb.getList();
                case 2: 
                    pb.addList(v.sizePhoneBook());
                case 3:
                    pb.getList();
                    pb.deletUser(v.deletUser());
                case 4:
                    break;
            }
        }
    }

    
}
