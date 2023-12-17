package com.unsia.unsiagram.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unsia.unsiagram.R;
import com.unsia.unsiagram.adapter.Ad_Notification;
import com.unsia.unsiagram.model.Notification;
import com.unsia.unsiagram.model.Search;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fr_Notification extends Fragment {

    private Context mContext;
    private RecyclerView recyclerView;

    public Fr_Notification() {
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
        return inflater.inflate(R.layout.fr_notification, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        Ad_Notification ad_notification = new Ad_Notification(mContext, getData());
        recyclerView.setAdapter(ad_notification);


    }
    private ArrayList<Notification> getData() {
        ArrayList<Notification> arrayList = new ArrayList<>();
        arrayList.add(new Notification("Nur Rahmad","https://i.pravatar.cc/150?img=1"));
        arrayList.add(new Notification("Gaudentius Giden","https://i.pravatar.cc/150?img=2"));
        arrayList.add(new Notification("Yuandi Pradana","https://i.pravatar.cc/150?img=3"));
        arrayList.add(new Notification("Fajar Kurniawan ","https://i.pravatar.cc/150?img=4"));
        arrayList.add(new Notification("Abim Auriza","https://i.pravatar.cc/150?img=6"));
        arrayList.add(new Notification("Lea","https://i.pravatar.cc/150?img=32"));
        return arrayList;
    }
}
