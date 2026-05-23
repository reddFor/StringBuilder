package org.example.task_2;

import java.util.Arrays;

public class CollectionArrayMapping {

//    Практическое задание - Collection - маппинг
//    Напишите метод arrayMapping(), который принимает на вход массив любого типа, вторым арументом метод должен принимать класс,
//    реализующий интерфейс Function, в котором один параметризованный метод - T apply(T o).
//    Метод должен быть реализован так чтобы возвращать новый массив, к каждому элементу которого была применена функция apply

    public static <T> T[] arrayMapping(T[] array, FunctionalClass<T> objFunction) {

        T[] result = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            result[i] = objFunction.apply(array[i]);
        }
        return result;
    }


}
