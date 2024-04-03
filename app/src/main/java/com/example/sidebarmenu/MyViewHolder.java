package com.example.sidebarmenu;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView name, desc;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ivItem);
        name = itemView.findViewById(R.id.namaItem);
        desc = itemView.findViewById(R.id.descItem);
    }
}
