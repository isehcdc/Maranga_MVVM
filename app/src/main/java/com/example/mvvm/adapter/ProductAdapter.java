package com.example.mvvm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvm.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    private final Context context;
    private List<Product> items = new ArrayList<>();

    public ProductAdapter(Context context) {
        this.context = context;
    }

    public void setProducts(List<Product> products) {
        this.items = products != null ? products : new ArrayList<>();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(
                LayoutInflater.from(context).inflate(com.example.mvvm.R.layout.item_product, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = items.get(position);
        holder.bind(product);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
