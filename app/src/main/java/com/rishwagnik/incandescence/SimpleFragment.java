package com.rishwagnik.incandescence;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hp on 27-08-2018.
 */

public class SimpleFragment extends android.support.v4.app.Fragment {
    ArrayList<RecyclerItem> items;
    RecyclerView.LayoutManager manager;
    MyRecyclerAdapter myAdapter;
    RecyclerView myRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.fragment_layout,container,false);
        items=new ArrayList<RecyclerItem>();
        addData();
        myRecyclerView=(RecyclerView)rootView.findViewById(R.id.myrecyclerview);
        manager=new LinearLayoutManager(getActivity());
        myRecyclerView.setLayoutManager(manager);

        myAdapter=new MyRecyclerAdapter(getActivity(),items);
        myRecyclerView.setAdapter(myAdapter);

        return rootView;
    }
    public void addData(){
        items.add(new RecyclerItem("Lol","Baal"));
        items.add(new RecyclerItem("Lol","Baal"));
        items.add(new RecyclerItem("Lol","Baal"));
        items.add(new RecyclerItem("Lol","Baal"));
    }

}
