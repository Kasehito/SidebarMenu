package com.example.sidebarmenu.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sidebarmenu.Item;
import com.example.sidebarmenu.MyAdapter;
import com.example.sidebarmenu.R;

import java.util.ArrayList;
import java.util.List;

public class MakananFragment extends Fragment {
    List<Item> items;
    MyAdapter adapter;

    public MakananFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_makanan, container, false);


        items = new ArrayList<>();
        items.add(new Item("Tahu Tek", "",R.drawable.img_tahutek));
        items.add(new Item("Lontong Balap","", R.drawable.img_lontongbalap));
        items.add(new Item("Rawon","",R.drawable.img_rawon));
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewMakanan);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyAdapter(getActivity(), items);
        recyclerView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }
}
