package pl.gornik.product.model;

import pl.gornik.product.exception.BadMakeProductException;

public class Product {
    private String name;
    private double price;
    private int amount;
    private String category;

    public Product(String name, double price, int amount, String category) {
        String message = "";
        if (name.isEmpty()) message = "Nazwa produktu nie może być pusta";

        if (price <= 0) message = "Cena nie może być mniejsza od zera lub równa zero";

        if (amount < 0) message = "Ilość nie może być mniejsza od zera";

        if (!message.isEmpty()) throw new BadMakeProductException(message);


        this.name = name;
        this.price = price;
        this.amount = amount;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }
}
