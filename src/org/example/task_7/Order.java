package org.example.task_7;



public class Order {
    //Предположим, у нас есть список заказов, и каждый заказ представляет собой продукт и его стоимость.
    // Задача состоит в использовании Stream API и коллекторов для решения следующих задач:
    //
    //Создайте список заказов с разными продуктами и их стоимостями.
    //Группируйте заказы по продуктам.(groupById?)
    //Для каждого продукта найдите общую стоимость всех заказов.(sum?)
    //Отсортируйте продукты по убыванию общей стоимости.(sort+desc?)
    //Выберите три самых дорогих продукта.(limit?)
    //Выведите результат: список трех самых дорогих продуктов и их общая стоимость.

    private String product;
    private double cost;

    public Order(String product, double cost) {
        this.product = product;
        this.cost = cost;
    }

    public String getProduct() {
        return product;
    }

    public double getCost() {
        return cost;
    }

}

































