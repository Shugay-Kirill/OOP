package Homework_5;

import Homework_5.PhoneBook;
import java.util.Scanner;

public class View {
    /**
     * Вывод меню
     * @return
     */
    public int menu() {
        System.out.println(
                "1. Показать телефонную книгу" +
                "2. Записать номер" +
                "3.Выход");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int numberMenu = scanner.nextInt();
                if (numberMenu > 0 && numberMenu < 5) {
                    return numberMenu;
                } else {
                    System.out.println("Введите номер из меню");
                }
            } catch (Exception e) {
                System.out.println("Введите номер из меню");
            }
        }
    }
    /**
     * Вывод контакта 
     * @param pb
     */
    public void printPhoneBook(PhoneBook pb) {
        System.out.println("Phone: " + pb.getPhone() + "; Name: " + pb.getName() + "; Comment: " + pb.getComment());
    }
    /**
     * заполнения контакта
     * @return
     */
    public PhoneBook sizePhoneBook(){
        Scanner scanner = new Scanner(System.in);
        int phoneUser = scanner.nextInt();
        String nameUser = scanner.nextLine();
        String commentUser = scanner.nextLine();
        return  new PhoneBook(phoneUser, nameUser, commentUser);
    }

}
