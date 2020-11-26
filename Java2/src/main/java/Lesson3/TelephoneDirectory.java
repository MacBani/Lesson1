package Lesson3;

import sun.reflect.generics.tree.Tree;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class TelephoneDirectory {

    private HashMap<String, TreeSet<String>> TelephoneBook;

    public TelephoneDirectory(){
        TelephoneBook = new HashMap<>();
    }

    public void add(String surname, String number){
        if(!TelephoneBook.containsKey(surname)){
            TelephoneBook.put(surname, new TreeSet<>());
        }
        TelephoneBook.get(surname).add(number);
    }

    public Collection<String> get (String surname){
        return TelephoneBook.get(surname);
    }


    public static void main(String[] args) {
        TelephoneDirectory phoneBook = new TelephoneDirectory();
        phoneBook.add("Petrov", "8800055536535");
        phoneBook.add("Petrov", "880005553675757535");
        phoneBook.add("Novik", "88000555365757535");
        System.out.println(phoneBook.get("Petrov"));
    }
}
