package org.example;

public class OrderSystem {
    public void placeOrder(Order cart) {
        double total = cart.calculateTotal();
        System.out.println("Стоимость букета: " + total);


        if (total > 0) {
            System.out.println("Оплата прошла успешно");
        } else {
            System.out.println("Похоже, вы ничего не выбрали");
        }
    }
}
