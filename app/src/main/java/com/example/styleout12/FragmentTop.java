package com.example.styleout12;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentTop extends Fragment {

    View view;
    private RecyclerView myRecyclerView;
    private List<Top> lstTop;

    public FragmentTop() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.top_fragment, container, false);
        myRecyclerView = (RecyclerView) view.findViewById(R.id.top_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstTop);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        lstTop = new ArrayList<>();
        lstTop.add(new Top(R.drawable.cardigan));
        lstTop.add(new Top(R.drawable.cardigan_collo));
        lstTop.add(new Top(R.drawable.falpa_cappuccio_tascone));
        lstTop.add(new Top(R.drawable.felpa_cappuccio));
        lstTop.add(new Top(R.drawable.felpa_cappuccio_cerniera));
        lstTop.add(new Top(R.drawable.maglione_dolcevita));
        lstTop.add(new Top(R.drawable.pullover));


    }
}