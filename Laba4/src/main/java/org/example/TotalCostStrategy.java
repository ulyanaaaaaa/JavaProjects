package org.example;

import java.util.List;

class TotalCostStrategy implements DataProcessingStrategy {
    @Override
    public void process(List<Bank> banks) {
        double totalCost = banks.stream().mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();
        System.out.println("Total cost: " + totalCost);
    }
}