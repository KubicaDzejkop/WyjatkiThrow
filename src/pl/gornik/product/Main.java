package pl.gornik.product;

import pl.gornik.product.exception.BadMakeProductException;
import pl.gornik.product.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        while(products.size() < 3) {
            try {
                System.out.println("Podaj nazwe produktu");
                String name = scanner.nextLine();
                System.out.println("Podaj cene produktu");
                double price = scanner.nextDouble();
                System.out.println("Podaj ilość produktu");
                int amount = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Podaj kategorie produktu");
                String category = scanner.nextLine();

                Product product = new Product(name, price, amount, category);
                products.add(product);

            } catch (BadMakeProductException e) {
                System.out.println("Błąd tworzenia produktu" + e.getMessage());
                e.printStackTrace();
            }
            System.out.println("Twoje produkty: ");
            for (Product product : products) {
                System.out.print(product.getName() + ", cena: " + product.getPrice() + ", ilość: " + product.getAmount()
                + ", kategoria: " + product.getCategory() + "\n");
            }
        }
    }
}
