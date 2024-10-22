package org.example;

import java.util.List;

public class TotalCostStrategy implements DataProcessingStrategy {
    @Override
    public void process(List<Product> products) {
        double totalCost = products.stream().mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();
        System.out.println("Total cost: " + totalCost);
    }
}