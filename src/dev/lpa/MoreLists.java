package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args ) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("grapes");
        System.out.println(groceries);


        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles","mustard","ketchup"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third element:"+groceries.get(2));

        if(groceries.contains("ketchup")) {
            System.out.println("List contains Mustard");
        }

        groceries.add("bananas");

        System.out.println("First ="+ groceries.indexOf("bananas"));
        System.out.println("Last ="+groceries.lastIndexOf("bananas"));
        System.out.println(groceries);
        groceries.remove(2);
        System.out.println(groceries);
        groceries.remove("mustard");
        System.out.println(groceries);

        groceries.removeAll(List.of("bananas","eggs","grapes"));
        System.out.println(groceries);

        groceries.addAll(List.of("cheese","millet","wheat","barley","rice"));
        System.out.println(groceries);

        groceries.retainAll(List.of("cheese","pickles","barley","wheat","ketchup"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("is Empty ="+groceries.isEmpty());


        groceries.addAll(List.of("apples","milk","cheese","mustard"));
        groceries.addAll(Arrays.asList("eggs","pickles","mustard","ham"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }
}