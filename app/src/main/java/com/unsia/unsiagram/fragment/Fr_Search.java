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
import com.unsia.unsiagram.adapter.Ad_Search;
import com.unsia.unsiagram.model.Search;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fr_Search extends Fragment {

    Context mContext;
    RecyclerView recyclerView;

    public Fr_Search() {
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
        return inflater.inflate(R.layout.fr_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        Ad_Search ad_search = new Ad_Search(mContext, getdata());
        recyclerView.setAdapter(ad_search);
    }

    private ArrayList<Search> getdata() {
        ArrayList<Search> arrayList = new ArrayList<>();
        arrayList.add(new Search("Yuandi Pradana", "https://i.pravatar.cc/150?img=1"));
        arrayList.add(new Search("Abim Auriza", "https://i.pravatar.cc/150?img=2"));
        arrayList.add(new Search("Fajar Kurniawan ", "https://i.pravatar.cc/150?img=3"));
        arrayList.add(new Search("Nur Rahmad", "hhttps://i.pravatar.cc/150?img=4"));
        arrayList.add(new Search("Gaudentius Giden", "https://i.pravatar.cc/150?img=5"));
        arrayList.add(new Search("Lea", "https://i.pravatar.cc/150?img=6"));
        return arrayList;
    }
}
