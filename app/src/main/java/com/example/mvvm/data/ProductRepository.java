package com.example.mvvm.data;

import com.example.mvvm.R;
import com.example.mvvm.model.Product;
import com.example.mvvm.model.User;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private static ProductRepository instance;

    private ProductRepository() {}

    public static synchronized ProductRepository getInstance() {
        if (instance == null) {
            instance = new ProductRepository();
        }
        return instance;
    }

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(R.drawable.burger, "Regular Burger", "P120", "Juicy Beef Burger"));
        products.add(new Product(R.drawable.pizza, "12-inch Pizza", "P150", "BBQ Beef and Mushroom"));
        products.add(new Product(R.drawable.fries, "French Fries", "100", "Crispy Golden Fries"));
        products.add(new Product(R.drawable.burger, "Deluxe Burger", "P180", "Premium Wagyu"));
        products.add(new Product(R.drawable.pizza, "15-inch Pizza", "P200", "Spicy Pepperoni Pizza"));
        return products;
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Gab", "gab@example.com"));
        users.add(new User("Ezra", "ezra@example.com"));
        users.add(new User("Shaina", "shaina24@example.com"));
        return users;
    }
}
