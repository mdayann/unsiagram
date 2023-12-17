package com.unsia.unsiagram.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.unsia.unsiagram.DetailsActivity;
import com.unsia.unsiagram.R;
import com.unsia.unsiagram.adapter.Ad_Gallery;
import com.unsia.unsiagram.adapter.Ad_Main;
import com.unsia.unsiagram.model.Post;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fr_Profile extends Fragment {

    private Context mContext;
    RecyclerView recyclerView , RecyclerViewPhoto;
    NestedScrollView nestedScrollView;
    LinearLayout linearLayout;

    public Fr_Profile() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fr_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        linearLayout = view.findViewById(R.id.l1);

        nestedScrollView = view.findViewById(R.id.scrollView);
        recyclerView = view.findViewById(R.id.RecyclerView);
        RecyclerViewPhoto = view.findViewById(R.id.RecyclerViewPhoto);

        RecyclerViewPhoto.setLayoutManager(new LinearLayoutManager(mContext,RecyclerView.HORIZONTAL , false));
        Ad_Gallery ad_gallery = new Ad_Gallery(mContext , getImages());
        RecyclerViewPhoto.setFocusable(false);
        RecyclerViewPhoto.setAdapter(ad_gallery);

        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setFocusable(false);
        Ad_Main ad_main = new Ad_Main(mContext, getData());
        recyclerView.setAdapter(ad_main);
        nestedScrollView.scrollTo(0,0);
        linearLayout.requestFocus();
        RecyclerViewPhoto.setFocusable(false);
        recyclerView.setFocusable(false);

        LinearLayout followers = view.findViewById(R.id.followers);
        followers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtra("fr", 5);
                mContext.startActivity(intent);
            }
        });

        LinearLayout following = view.findViewById(R.id.following);
        following.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtra("fr", 6);
                mContext.startActivity(intent);
            }
        });


    }

    private ArrayList<String> getImages() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("https://picsum.photos/id/237/400/200");
        arrayList.add("https://picsum.photos/id/238/400/200");
        arrayList.add("https://picsum.photos/id/239/400/200");
        arrayList.add("https://picsum.photos/id/240/400/200");
        arrayList.add("https://picsum.photos/id/241/400/200");
        arrayList.add("https://picsum.photos/id/242/400/200");
        arrayList.add("https://picsum.photos/id/243/400/200");
        arrayList.add("https://picsum.photos/id/244/400/200");
        return arrayList;
    }

    private ArrayList<Post> getData() {
        ArrayList<Post> arrayList = new ArrayList<>();
        arrayList.add(new Post("", R.drawable.post2, "", 0));
        arrayList.add(new Post("", R.drawable.post3, "", 0));
        arrayList.add(new Post("", R.drawable.post4, "", 0));
        arrayList.add(new Post("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4", 0, "", 1));
        return arrayList;
    }
}
