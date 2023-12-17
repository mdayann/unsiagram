package com.unsia.unsiagram.adapter.holder;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.unsia.unsiagram.R;
import com.unsia.unsiagram.adapter.Ad_list;
import com.unsia.unsiagram.model.Post;
import com.unsia.unsiagram.model.Stories;
import com.unsia.unsiagram.utility.CenterZoomLayoutManager;

import java.util.ArrayList;

public class ViewHolderList extends RecyclerView.ViewHolder {

    private RecyclerView recyclerView;
    CenterZoomLayoutManager centerZoomLayoutManager;
    LinearSnapHelper snapHelper;

    public ViewHolderList(@NonNull View itemView, Context mContext) {
        super(itemView);
        recyclerView = itemView.findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setFocusable(false);
        centerZoomLayoutManager = new CenterZoomLayoutManager(mContext, RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(centerZoomLayoutManager);
        snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);
        recyclerView.setOnFlingListener(snapHelper);
        Ad_list ad_list = new Ad_list(getData(), mContext);
        recyclerView.setAdapter(ad_list);
        recyclerView.smoothScrollToPosition(1);

    }

    public void setData(Post post, Context mContext) {

    }

    private ArrayList<Stories> getData() {
        ArrayList<Stories> arrayList = new ArrayList<>();
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=1", "Yuandi"));
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=2", "Auriza"));
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=3", "Fajar"));
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=4", "Gaudentius"));
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=5", "Nur"));
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=6", "Ayam"));
        arrayList.add(new Stories("https://i.pravatar.cc/150?img=7", "Lea"));
        return arrayList;
    }
}
