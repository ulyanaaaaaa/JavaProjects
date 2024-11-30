package org.example;

class DataProcessingFactory {
    public static DataProcessingStrategy getStrategy(String type) {
        switch (type) {
            case "totalCost":
                return new TotalCostStrategy();
            default:
                throw new IllegalArgumentException("Неизвестный тип стратегии");
        }
    }
}
