package phonebook1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;




public class main {
    public static void main(String[] args) {

        phonebook book = new phonebook();
        ArrayList<Users> userList = new ArrayList<>();

        int inp = 1;
        while (inp != 0) {
            inp = menu();
            if (inp == 1) {
                book.showAll(userList);
            }
            if (inp == 2) {
                ArrayList<Integer> numss = new ArrayList<>();
                Scanner iScanner = new Scanner(System.in);
                System.out.printf("Введите имя контакта: ");
                String newName = iScanner.nextLine();
                Integer newNumber = 1;
                while (newNumber != 0) {
                    System.out.printf("Введите номер телефона контакта(введите 0 если номеров больше нет): ");
                    newNumber = iScanner.nextInt();
                    if (newNumber == 0)
                        break;
                    numss.add(newNumber);
                }
                Users newUser = new Users(newName, numss);
                book.addUser(newUser, userList);
            }
            if (inp == 3) {
                Scanner iScanner = new Scanner(System.in);
                System.out.printf("Введите имя контакта для удаления: ");
                String nameToDel = iScanner.nextLine();
                book.delete(nameToDel);
                System.out.printf("Контакт %s удален\n", nameToDel);
            }
            if (inp == 4) {
                Scanner iScanner = new Scanner(System.in);
                System.out.printf("Введите имя контакта для поиска: ");
                String nameToFind = iScanner.nextLine();
                book.find(nameToFind);
            }
        }
    }


    public static int menu() {
        String menu = "1. Показать все контакты\n2. Добавить новый контакт\n3. Удалить контакт\n4. Найти контакт\n0. Завершить программу";
        System.out.println(menu);
        Scanner iScanner1 = new Scanner(System.in);
        System.out.printf("Введите цифру меню: ");
        int input = iScanner1.nextInt();
        return input;
    }



}

