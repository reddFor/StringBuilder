package org.example;

import org.example.task_1.StringBuilderWithUndo;
import org.example.task_3.CountOfElements;
import org.example.task_7.Order;
import org.example.task_7.StreamCollectors;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        StringBuilderWithUndo betaStringBuilder = new StringBuilderWithUndo();
//
//        betaStringBuilder.append("SNAP");
//        betaStringBuilder.append("SHOT");
//        betaStringBuilder.append(01.12);
//        betaStringBuilder.insert(1, "-");
//        betaStringBuilder.append(02);
//        betaStringBuilder.undo();
//        System.out.println(betaStringBuilder);
//
//        //task_2
//
////        Integer[] array = {1, 3, 5};
////        FunctionalClass<Integer> fc = new FunctionalClass<>();
////        String[] a = CollectionArrayMapping.arrayMapping(array, fc);
////        System.out.println(a[1]);
//
//        //task_3
//        CountOfElements countOfElements = new CountOfElements();
//        String[] arrayString =  {"a", "a", "b", "c", "a", "q", "b"};
//        Map<String, Integer> resultCountMapElement = countOfElements.mapElements(arrayString);

        //task_7
        StreamCollectors streamCollectors = new StreamCollectors();
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0)
        );
        System.out.println(streamCollectors.filterForThreeOverPriceProduct(orders));
    }

}