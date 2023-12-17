package com.unsia.unsiagram.fragment;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.unsia.unsiagram.R;
import com.unsia.unsiagram.adapter.Ad_Chat;
import com.unsia.unsiagram.adapter.Ad_list;
import com.unsia.unsiagram.model.Chat;
import com.unsia.unsiagram.model.Search;
import com.unsia.unsiagram.model.Stories;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fr_Chats extends Fragment {

    private RecyclerView Chats_Recycler, Stores_Recycler;
    private Context mContext;
    private Ad_Chat ad_chats;

    public Fr_Chats() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fr_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Chats_Recycler = view.findViewById(R.id.RecyclerView);
        Stores_Recycler = view.findViewById(R.id.RecyclerViewStores);


        Chats_Recycler.setLayoutManager(new LinearLayoutManager(mContext));
        Chats_Recycler.setHasFixedSize(true);
        ad_chats = new Ad_Chat(getChatData(), mContext);
        Chats_Recycler.setAdapter(ad_chats);

        Stores_Recycler.setLayoutManager(new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false));
        Chats_Recycler.setHasFixedSize(true);
        Ad_list ad_list = new Ad_list(getData(), mContext);
        Stores_Recycler.setAdapter(ad_list);


    }

    private ArrayList<Chat> getChatData() {
        ArrayList<Chat> arrayList = new ArrayList<>();
        arrayList.add(new Chat("Yuandi Pradana", "https://i.pravatar.cc/150?img=1", "Kamu dimana"));
        arrayList.add(new Chat("Abim Auriza", "https://i.pravatar.cc/150?img=2", "Dengan Siapa"));
        arrayList.add(new Chat("Fajar Kurniawan ", "https://i.pravatar.cc/150?img=3", "Semalam berbuat apa"));
        arrayList.add(new Chat("Nur Rahmad", "https://i.pravatar.cc/150?img=4", "Disini aku"));
        arrayList.add(new Chat("Gaudentius Giden", "https://i.pravatar.cc/150?img=5", "Menunggumu"));
        arrayList.add(new Chat("Lea", "https://i.pravatar.cc/150?img=6", "Dan bertanya"));
        return arrayList;
    }

    private ArrayList<Stories> getData() {
        ArrayList<Stories> arrayList = new ArrayList<>();
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=1", "Yuandi"));
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=2", "Auraxxi"));
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=3", "Fajar"));
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=4", "Giden"));
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=5", "Lea"));
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=6", "Rahmat"));
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=7", "Nur"));
        return arrayList;
    }


}
