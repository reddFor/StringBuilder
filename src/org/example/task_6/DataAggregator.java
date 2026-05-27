package org.example.task_6;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class DataAggregator {

    public ProductInfo aggregateProductInfo(String productName) {

        CompletableFuture<Double> priceFuture =
                CompletableFuture.supplyAsync(() -> fetchPrice(productName))
                        .exceptionally(ex -> {
                            System.out.println("Ошибка получения Цены");
                            return 0.0;
                        });

        CompletableFuture<String> descriptionFuture =
                CompletableFuture.supplyAsync(() -> fetchDescription(productName))
                        .exceptionally(ex -> {
                            System.out.println("Ошибка получения Описания");
                            return "Нет данных";
                        });

        CompletableFuture<Double> ratingFuture =
                CompletableFuture.supplyAsync(() -> fetchRating(productName))
                        .exceptionally(ex -> {
                            System.out.println("Ошибка получения Рейтинга");
                            return 0.0;
                        });

        CompletableFuture<Void> allFutures =
                CompletableFuture.allOf(
                        priceFuture,
                        descriptionFuture,
                        ratingFuture
                );

        allFutures.join();

        return new ProductInfo(
                productName,
                priceFuture.join(),
                descriptionFuture.join(),
                ratingFuture.join()
        );
    }

    private Double fetchPrice(String productName) {

        imitateDelay();
        randomException();
        System.out.println("Цена");
        return 98888.50;
    }

    private String fetchDescription(String productName) {

        imitateDelay();
        randomException();
        System.out.println("Описание: " + productName);
        return productName;
    }

    private Double fetchRating(String productName) {

        imitateDelay();
        randomException();
        System.out.println("Рейтинг");
        return 4.8;
    }

    private void imitateDelay() {
        try {
            int delay =
                    ThreadLocalRandom.current()
                            .nextInt(1000, 3000);
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void randomException() {
        int random =
                ThreadLocalRandom.current()
                        .nextInt(10);
        if (random < 2) {
            throw new RuntimeException("Упс, произошла ошибка, мы не при чем");
        }
    }
}