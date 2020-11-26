package Lesson3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Array {

    public static void main(String[] args) {
        String s;
        int counter = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("AA");
        arrayList.add("BB");
        arrayList.add("CC");
        arrayList.add("DD");
        arrayList.add("EE");
        arrayList.add("FF");
        arrayList.add("AA");
        arrayList.add("A");
        arrayList.add("AB");
        arrayList.add("BB");

        Set<String> set = new HashSet<>();

        for (int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
            set.add(arrayList.get(i));
        }
        System.out.println();
        System.out.print(set + " ");
        System.out.println();
        counter = arrayList.size() - set.size();
        System.out.println(counter);
    }
}
