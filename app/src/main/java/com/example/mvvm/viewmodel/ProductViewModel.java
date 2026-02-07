package com.example.mvvm.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm.data.ProductRepository;
import com.example.mvvm.model.Product;
import com.example.mvvm.model.User;

import java.util.List;

public class ProductViewModel extends ViewModel {

    private final ProductRepository repository;
    private final MutableLiveData<List<Product>> productsLiveData = new MutableLiveData<>();
    private final MutableLiveData<List<User>> usersLiveData = new MutableLiveData<>();

    public ProductViewModel() {
        repository = ProductRepository.getInstance();
        loadProducts();
        loadUsers();
    }

    public void loadProducts() {
        productsLiveData.setValue(repository.getProducts());
    }

    public void loadUsers() {
        usersLiveData.setValue(repository.getUsers());
    }

    public LiveData<List<Product>> getProducts() {
        return productsLiveData;
    }

    public LiveData<List<User>> getUsers() {
        return usersLiveData;
    }
}
