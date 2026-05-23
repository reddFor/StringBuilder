package org.example.task_2;

import java.util.function.Function;

public class FunctionalClass<T> implements Function<T, T> {

    @Override
    public T apply(T t) {
        return t;
    }

}
