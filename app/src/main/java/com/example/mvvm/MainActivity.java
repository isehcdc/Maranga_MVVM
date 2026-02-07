package com.example.mvvm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvm.adapter.ProductAdapter;
import com.example.mvvm.adapter.UserAdapter;
import com.example.mvvm.viewmodel.ProductViewModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private UserAdapter userAdapter;
    private ProductViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        Button btnProducts = findViewById(R.id.btnProducts);
        Button btnUsers = findViewById(R.id.btnUsers);

        productAdapter = new ProductAdapter(this);
        userAdapter = new UserAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        viewModel = new ViewModelProvider(this).get(ProductViewModel.class);

        viewModel.getProducts().observe(this, products -> {
            productAdapter.setProducts(products);
            if (recyclerView.getAdapter() != productAdapter) {
                recyclerView.setAdapter(productAdapter);
            }
        });

        viewModel.getUsers().observe(this, users -> {
            userAdapter.setUsers(users);
        });

        btnProducts.setOnClickListener(v -> showProducts());
        btnUsers.setOnClickListener(v -> showUsers());

        showProducts();
    }

    private void showProducts() {
        recyclerView.setAdapter(productAdapter);
    }

    private void showUsers() {
        recyclerView.setAdapter(userAdapter);
    }
}
