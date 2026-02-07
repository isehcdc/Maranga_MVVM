package com.example.mvvm.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvm.R;
import com.example.mvvm.model.Product;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    private final ImageView imageView;
    private final TextView nameText;
    private final TextView priceText;
    private final TextView descriptionText;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        nameText = itemView.findViewById(R.id.textName);
        priceText = itemView.findViewById(R.id.textPrice);
        descriptionText = itemView.findViewById(R.id.textDescription);
    }

    public void bind(Product product) {
        imageView.setImageResource(product.getImageResId());
        nameText.setText(product.getName());
        priceText.setText(product.getPrice());
        descriptionText.setText(product.getDescription());
        descriptionText.setVisibility(
                product.getDescription() != null && !product.getDescription().isEmpty()
                        ? View.VISIBLE : View.GONE
        );
    }
}
