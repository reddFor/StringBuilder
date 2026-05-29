package org.example.task_7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectors {

    public List<Map.Entry<String, Double>> filterForThreeOverPriceProduct(List<Order> orders) {

        Map<String, Double> sumProductCost = orders.stream()
                .collect(
                        Collectors.groupingBy(
                                order -> order.getProduct(), Collectors.summingDouble(order -> order.getCost())
                        )
                );
        return sumProductCost.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
