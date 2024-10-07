package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Bouquet> bouquets = new ArrayList<>();

    public void addProduct(Bouquet bouquet) {
        bouquets.add(bouquet);
    }

    public double calculateTotal() {
        return bouquets.stream().mapToDouble(Bouquet::getPrice).sum();
    }
}
