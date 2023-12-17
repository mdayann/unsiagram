package com.unsia.unsiagram.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.unsia.unsiagram.DetailsActivity;
import com.unsia.unsiagram.R;
import com.unsia.unsiagram.adapter.holder.ViewHolderChat;
import com.unsia.unsiagram.model.Chat;

import java.util.ArrayList;


public class Ad_Chat extends RecyclerView.Adapter<ViewHolderChat> {

    private ArrayList<Chat> chatData;
    private Context mContext;



    public Ad_Chat(ArrayList<Chat> chatData, Context context) {
        this.mContext = context;
        this.chatData = chatData;
    }

    @NonNull
    @Override
    public ViewHolderChat onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat, viewGroup, false);
        return new ViewHolderChat(view ,mContext);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderChat holder, int position) {
        Chat chat = chatData.get(position);
        Glide.with(mContext).load(chat.getImage()).into(holder.profileImage);
        holder.name.setText(chat.getName());
        holder.message.setText(chat.getMessage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext , DetailsActivity.class);
                intent.putExtra("fr" , 4);
                mContext.startActivity(intent);
            }
        });


    }




    @Override
    public int getItemCount() {
        return chatData.size();
    }

    public void setFadeAnimation(View view) {
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(500);
        view.startAnimation(anim);
    }
}
