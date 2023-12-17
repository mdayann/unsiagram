package com.unsia.unsiagram.adapter.holder;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unsia.unsiagram.R;

public class ViewHolderGallery extends RecyclerView.ViewHolder {

   public ImageView gallery_image;

    public ViewHolderGallery(@NonNull View itemView) {
        super(itemView);
        gallery_image = itemView.findViewById(R.id.gallery_image);
    }
}
