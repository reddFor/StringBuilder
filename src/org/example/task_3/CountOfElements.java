package org.example.task_3;

import java.util.HashMap;
import java.util.Map;

public class CountOfElements {
    //    Collection - count of elements
//    Напишите метод, который получает на вход массив элементов и возвращает Map ключи
//    в котором - элементы, а значения - сколько раз встретился этот элемент
    public <T> Map<T, Integer> mapElements(T[] el) {
        Map<T, Integer> countElementsMap = new HashMap<>();
        for (T t : el) {
            boolean containsKey = countElementsMap.containsKey(t);
            if (containsKey) {
                int value = countElementsMap.get(t);
                countElementsMap.put(t, ++value);
            } else countElementsMap.put(t, 1);
        }
        return countElementsMap;
    }
}
