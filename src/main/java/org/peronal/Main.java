package org.peronal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.peronal.Collection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
            list.add("Apples");
            list.add("Banana");
            list.add("Avocado");
            list.add("Oranges");
            list.add("Pineapples");
        Collection.shuffle(list, new Random());
        System.out.println(list);
    }
}