package phonebook1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.Iterator;

import phonebook1.Users;

public class phonebook{
    private HashMap<String, ArrayList<Integer>> book = new HashMap<>();


    public void addUser(Users newUser, ArrayList<Users> userList) {
        boolean repeats = false;
        if(book.containsKey(newUser.getName())) {
            book.get(newUser.getName()).addAll(newUser.getNumbers());
        }
        book.put(newUser.getName(), newUser.getNumbers());
        for (int i = 0; i < userList.size(); i++) {
            if (newUser.equals(userList.get(i)))
            repeats = true;
        }
        if (repeats == false)
            userList.add(newUser);
    }

    // public String findKeyByValue(HashMap<String, ArrayList<Integer>> pb, ArrayList<Integer> value){
    //     Set<Map.Entry<String,ArrayList<Integer>>> entrySet = pb.entrySet();
    //     String foundKey = "";
    //     for (Map.Entry<String,ArrayList<Integer>> pair: entrySet){
    //         if (value.equals(pair.getValue()))
    //             foundKey = pair.getKey();
    //     }
    //     if (foundKey != "") return foundKey;
    //     else{
    //         System.out.println("Ключ не найден");
    //         return foundKey;
    // }
// }

    public void showAll(ArrayList<Users> userList) {
        userList.sort(null);
        System.out.println(userList);
}

    public void delete(String name) {
        book.remove(name);
    }

    public void find(String userToFind) {
        if (book.containsKey(userToFind)) {
            System.out.println(book.get(userToFind));
        } else {
            System.out.println("Такого контакта нет: " + userToFind);
        }
    }

}

