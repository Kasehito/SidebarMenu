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

public class FavoritFragment extends Fragment {

    List<Item> items;
    MyAdapter adapter;

    public FavoritFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorit, container, false);

        items = new ArrayList<>();
        items.add(new Item("Tahu Tek","", R.drawable.img_tahutek));
        items.add(new Item("Lontong Balap","", R.drawable.img_lontongbalap));
        items.add(new Item("Rawon","", R.drawable.img_rawon));
        items.add(new Item("Wedang Ronde","", R.drawable.img_ronde));
        items.add(new Item("Soda Gembira","", R.drawable.img_sodagembira));
        items.add(new Item("Es Sinom","", R.drawable.img_sinom));


        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewFavorit);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyAdapter(getActivity(), items);
        recyclerView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }
}
