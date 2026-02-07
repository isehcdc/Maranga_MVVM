package com.example.mvvm.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvm.R;
import com.example.mvvm.model.User;

public class UserViewHolder extends RecyclerView.ViewHolder {

    private final ImageView avatarView;
    private final TextView nameText;
    private final TextView emailText;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        avatarView = itemView.findViewById(R.id.avatarView);
        nameText = itemView.findViewById(R.id.textUserName);
        emailText = itemView.findViewById(R.id.textUserEmail);
    }

    public void bind(User user) {
        avatarView.setImageResource(R.drawable.ic_person_placeholder);
        nameText.setText(user.getName());
        emailText.setText(user.getEmail());
    }
}
