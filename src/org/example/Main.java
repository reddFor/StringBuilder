package org.example;


import org.example.task_6.DataAggregator;
import org.example.task_6.ProductInfo;

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


        //task6
        DataAggregator aggregator = new DataAggregator();
        ProductInfo product = aggregator.aggregateProductInfo("Ноутбук");
        System.out.println(product.toString());
    }
}