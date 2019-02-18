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

public class FragmentUp extends Fragment {

    View uView;
    private RecyclerView myRecyclerViewUp;
    private List<Up> lstUp;

    public FragmentUp() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        uView = inflater.inflate(R.layout.up_fragment, container, false);
        myRecyclerViewUp = (RecyclerView) uView.findViewById( R.id.up_recyclerview );
        RecyclerViewAdapterUp recyclerViewAdapterUp = new RecyclerViewAdapterUp( getContext(), lstUp );
        myRecyclerViewUp.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        myRecyclerViewUp.setAdapter( recyclerViewAdapterUp );
        return uView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        lstUp = new ArrayList<>();
        lstUp.add(new Up( R.drawable.camicia_collo ));
        lstUp.add( new Up( R.drawable.camicia_collo_taschino ));
        lstUp.add( new Up( R.drawable.camicia_nocollo ));
        lstUp.add( new Up( R.drawable.camicia_nocollo_taschino ));
        lstUp.add( new Up( R.drawable.camici_manichecorte_collo ));
        lstUp.add( new Up( R.drawable.camicia_manichecorte_collo_taschino ));
        lstUp.add( new Up( R.drawable.polo_collo ));
        lstUp.add( new Up( R.drawable.polo_collo_taschino ));
        lstUp.add( new Up( R.drawable.polo_collo_orli ));
        lstUp.add( new Up( R.drawable.polo_collo_orli_taschino ));
        lstUp.add( new Up( R.drawable.tshirt_taschino_nocollo ));
        lstUp.add( new Up( R.drawable.tshirt_taschino ));

    }
}