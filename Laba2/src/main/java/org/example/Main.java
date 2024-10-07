package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Создание объектов
        Order cart = new Order();
        cart.addProduct(new Bouquet("Розы, 10 шт.", 1200.00));
        cart.addProduct(new Bouquet("Пионы, 13 шт.", 2000.00));

        OrderSystem orderSystem = new OrderSystem();
        orderSystem.placeOrder(cart);
    }
}