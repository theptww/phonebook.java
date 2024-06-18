package phonebook1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Users implements Comparable<Users>{
    public String name;

    public ArrayList<Integer> numbers;


    public Users(String name, ArrayList<Integer> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    @Override
    public int compareTo(Users o){
        return  o.numbers.size() - this.numbers.size();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        String print = "";
        for (int i = 0; i < numbers.size(); i++) {
            print = "\n" + "\nИМЯ:" + name;

            print += "\nТЕЛЕФОН(Ы): \n" + numbers;
        }
        return print;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (obj == null || obj.getClass() != this.getClass()) return false;

        Users c = (Users) obj;

        return Objects.equals(c.name, name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

/*    public user addUser() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);


        System.out.printf("Сколько номеров телефона имеет %s? ", name);
        int phonesAmount = iScanner.nextInt();

        ArrayList<Integer> phones = new ArrayList<Integer>();

        for (int i = 0; i < phonesAmount; i++) {
            System.out.printf("Введите %d номер: ", i + 1);
            phones.add(iScanner.nextInt());
        }


        user p = new user(
                name,
                phones
        );
        return p;
    }*/
}
